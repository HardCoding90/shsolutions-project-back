package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.*;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ventas")
public class VentasController {

    private final String DOMAIN_URL = DOMAIN + "ventas";
    private final String DOMAIN_URL_INVENTARIOS = DOMAIN + "inventarios";
    private final String DOMAIN_URL_VENTAS_PRODUCTOS = DOMAIN + "ventasProductos";
    private final String DOMAIN_URL_PRODUCTOS = DOMAIN + "productos";

    @GetMapping("/cascaron")
    Ventas cascaron() {
        return new Ventas();
    }

    @GetMapping("/findAll")
    List<Ventas> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Ventas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Ventas> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", Ventas[].class));
    }

    @GetMapping("/findById/{id}")
    Ventas findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, Ventas.class);
    }

    @PostMapping()
    Ventas save(@RequestBody Ventas ventas) {
        Ventas venta =  restTemplate.postForObject(DOMAIN_URL, ventas, Ventas.class);
        ventas.setIdVenta(venta.getIdVenta());
        ventas.setTotal(realizarVenta(venta));
        return venta;
    }

    @PutMapping()
    Ventas update(@RequestBody Ventas ventas) {
        return restTemplate.postForObject(DOMAIN_URL, ventas, Ventas.class);
    }

    //@PostMapping("/realizarVenta")
    double realizarVenta(@RequestBody Ventas ventas) {
        List<Inventarios> inventariosConCantidadExistente;
        HashMap<Integer, Integer> ventasProductosProveedores = new HashMap<>();
        List<Inventarios> inventario = new ArrayList<>();
        List<VentasProductos> ventasProductos = new ArrayList<>();
        List<Productos> productosList = new ArrayList<>();
        List<Integer> idsProductosList = new ArrayList<>();
        final Inventarios[] inventariosOptional = new Inventarios[1];
        if(ventas.getProductosVentasDTOList() != null && !ventas.getProductosVentasDTOList().isEmpty()){
            idsProductosList = ventas.getProductosVentasDTOList().stream().map(ProductosVentasDTO::getIdProducto).collect(Collectors.toList());
            inventario = Arrays.asList(restTemplate.postForObject(DOMAIN_URL_INVENTARIOS + "/sucursal/" + ventas.getIdSucursal() + "/productoIdList",idsProductosList,Inventarios[].class));
            productosList = Arrays.asList(restTemplate.postForObject(DOMAIN_URL_PRODUCTOS + "/findByIdList",idsProductosList,Productos[].class));
            if(!inventario.isEmpty()){
                inventariosConCantidadExistente = inventario.stream().filter(x -> x.getCantidadExistente() != null && x.getCantidadExistente() > 0).collect(Collectors.toList());
                if(!inventariosConCantidadExistente.isEmpty()){
                    for(ProductosVentasDTO pv : ventas.getProductosVentasDTOList()){
                        obtenerProveedoresProductos(inventariosConCantidadExistente,pv, ventasProductosProveedores);
                    }
                }
            }
        }
        if(!ventasProductosProveedores.isEmpty()){
            List<Inventarios> finalInventario = inventario;
            List<Productos> finalProductosList = productosList;
            ventasProductosProveedores.forEach((key, value) -> {
                inventariosOptional[0] = finalInventario.stream().filter(f -> f.getIdProductoProveedor().equals(key)).findFirst().orElse(null);
                VentasProductos ventaProducto = new VentasProductos();
                ventaProducto.setIdInventario(inventariosOptional[0].getIdInventario());
                ventaProducto.setIdVenta(ventas.getIdVenta());
                ventaProducto.setCantidadVendida(value);
                ventaProducto.setValorVentaUnidad(finalProductosList.stream().filter(s -> s.getIdProducto().equals(inventariosOptional[0].getIdProducto())).findFirst().get().getValorUnidadVenta().doubleValue());
                ventasProductos.add(ventaProducto);
            });
            restTemplate.postForObject(DOMAIN_URL_VENTAS_PRODUCTOS + "/saveAll", ventasProductos, Void.class);
        }
        double total = 0d;
        for(VentasProductos vp : ventasProductos){
            total = total + (vp.getCantidadVendida() * vp.getValorVentaUnidad());
        }
        return total;
    }

    private void realizarVenta(){

    }

    private void obtenerProveedoresProductos(List<Inventarios> inventario, ProductosVentasDTO pv, HashMap<Integer,Integer> ventasProductosProveedores){
        List<Inventarios> inventariosPorProducto = inventario.stream().filter(x -> x.getIdProducto() != null && x.getIdProducto().equals(pv.getIdProducto())).collect(Collectors.toList());
        Integer idProductoProveedor;
        int cantidad = pv.getCantidad();
        int longitudInventario;
        double total =0d;
        while(cantidad > 0){
            longitudInventario = 0;
            for(int i = 0; i < inventariosPorProducto.size(); i++){
                idProductoProveedor = inventariosPorProducto.get(longitudInventario).getIdProductoProveedor();
                if(inventariosPorProducto.get(longitudInventario).getCantidadExistente() > 0 && cantidad > 0 && inventariosPorProducto.get(longitudInventario).getIdProducto().equals(pv.getIdProducto())){
                    inventariosPorProducto.get(longitudInventario).setCantidadExistente(inventariosPorProducto.get(longitudInventario).getCantidadExistente() - 1);
                    if(ventasProductosProveedores.containsKey(idProductoProveedor)){
                        ventasProductosProveedores.compute(idProductoProveedor,((integer, integer2) -> Integer.sum(integer2,1)));
                    }else{
                        ventasProductosProveedores.put(idProductoProveedor,1);
                    }
                    total += inventariosPorProducto.get(longitudInventario).getValor().doubleValue();
                    cantidad--;
                }
            }
        }
        restTemplate.postForObject(DOMAIN_URL_INVENTARIOS + "/saveAll", inventariosPorProducto,Void.class);
    }
}
