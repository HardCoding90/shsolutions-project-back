package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Inventarios;
import com.shsolutions.project.negocio.modelos.Ordenes;
import com.shsolutions.project.negocio.modelos.OrdenesProductos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ordenes")
public class OrdenesController {

    private final String DOMAIN_URL = DOMAIN + "ordenes";
    private final String DOMAIN_URL_ORDENES_PRODUCTOS = DOMAIN + "ordenesProductos";
    private final String DOMAIN_URL_INVENTARIOS = DOMAIN + "inventarios";

    @GetMapping("/cascaron")
    Ordenes cascaron() {
        return new Ordenes();
    }

    @GetMapping("/findAll")
    List<Ordenes> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Ordenes[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Ordenes> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", Ordenes[].class));
    }

    @GetMapping("/findById/{id}")
    Ordenes findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, Ordenes.class);
    }

    @PostMapping()
    Ordenes save(@RequestBody Ordenes ordenes) {
        ordenes.setIndicadorHabilitado(false);
        Ordenes orden = restTemplate.postForObject(DOMAIN_URL, ordenes, Ordenes.class);
        List<OrdenesProductos> ordenesProductos;
        int idOrden = orden.getIdOrden();
        ordenes.setIdOrden(idOrden);
        if(ordenes.getOrdenesProductos() != null && !ordenes.getOrdenesProductos().isEmpty()){
            ordenesProductos = ordenes.getOrdenesProductos();
            ordenesProductos.forEach(x -> x.setIdOrden(idOrden));
            Arrays.asList(restTemplate.postForObject(DOMAIN_URL_ORDENES_PRODUCTOS + "/saveAll", ordenesProductos, OrdenesProductos[].class));
        }
        ordenes.setIndicadorRecibida(true);
        update(ordenes);
        return ordenes;
    }

    @PutMapping()
    Ordenes update(@RequestBody Ordenes ordenes) {
        if(ordenes.getIndicadorRecibida() != null && ordenes.getIndicadorRecibida()){
            Optional<OrdenesProductos> ordenProducto;
            List<Inventarios> inventariosListActualizado = new ArrayList<>();
            List<OrdenesProductos> ordenesProductosList = Arrays.asList(restTemplate.getForObject(DOMAIN_URL_ORDENES_PRODUCTOS + "/orden/" + ordenes.getIdOrden(),OrdenesProductos[].class));
            List<Inventarios> inventariosList = Arrays.asList(restTemplate.postForObject(DOMAIN_URL_INVENTARIOS + "/sucursal/"+
                    ordenes.getIdSucursal() +"/productoProveedorIdList",ordenesProductosList.stream().map(OrdenesProductos::getIdProductoProveedor).collect(Collectors.toList()), Inventarios[].class));
            if(!inventariosList.isEmpty()){
                for(Inventarios inv: inventariosList){
                    ordenProducto = ordenesProductosList.stream().filter(f -> f.getIdProductoProveedor() != null && f.getIdProductoProveedor().equals(inv.getIdProductoProveedor())).findFirst();
                    if(ordenProducto.isPresent()){
                        inv.setCantidadExistente(inv.getCantidadExistente() + ordenProducto.get().getCantidad());
                        inventariosListActualizado.add(inv);
                    }
                }
                restTemplate.postForObject(DOMAIN_URL_INVENTARIOS + "/saveAll", inventariosListActualizado,Void.class);
            }else{
                List<Inventarios> inventarios = new ArrayList<>();
                for(OrdenesProductos or: ordenes.getOrdenesProductos()){
                    Inventarios in = new Inventarios();
                    in.setIdProducto(or.getIdProducto());
                    in.setIdProductoProveedor(or.getIdProductoProveedor());
                    in.setIdSucursal(ordenes.getIdSucursal());
                    in.setIndicadorHabilitado(true);
                    in.setCantidadExistente(or.getCantidad());
                    inventarios.add(in);
                }
                restTemplate.postForObject(DOMAIN_URL_INVENTARIOS + "/saveAll", inventarios,Void.class);
            }
        }
        return restTemplate.postForObject(DOMAIN_URL, ordenes, Ordenes.class);
    }
}
