package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Inventarios;
import com.shsolutions.project.negocio.modelos.Productos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/productos")
public class ProductosController {

    private final String DOMAIN_URL = DOMAIN + "productos";
    private final String DOMAIN_URL_INVENTARIOS = DOMAIN + "inventarios";
    private final String DOMAIN_URL_PRODUCTOS = DOMAIN + "productos";

    @GetMapping("/cascaron")
    Productos cascaron() {
        return new Productos();
    }

    @GetMapping("/findAll")
    List<Productos> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Productos[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Productos> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", Productos[].class));
    }

    @GetMapping("/findById/{id}")
    Productos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, Productos.class);
    }

    @PostMapping("/saveAll")
    List<Productos> saveAll(@RequestBody List<Productos> productos) {
        return Arrays.asList(restTemplate.postForObject(DOMAIN_URL + "/saveAll", productos, Productos[].class));
    }

    @GetMapping("/sucursal/{idSucursal}")
    List<Productos> saveAll(@PathVariable Integer idSucursal) {
        List<Inventarios> inventarios =  Arrays.asList(restTemplate.getForObject(DOMAIN_URL_INVENTARIOS + "/sucursal/" + idSucursal, Inventarios[].class));
        List<Productos> productosListFinal = new ArrayList<>();
        if(!inventarios.isEmpty()){
            List<Inventarios> inventariosList = inventarios.stream().filter(x -> x.getCantidadExistente() > 0).collect(Collectors.toList());
            if(!inventariosList.isEmpty()){
                List<Productos> productosList = Arrays.asList(restTemplate.postForObject(DOMAIN_URL_PRODUCTOS + "/findByIdList",
                        inventarios.stream().map(Inventarios::getIdProducto).collect(Collectors.toSet()), Productos[].class));
                if(!productosList.isEmpty()){
                    for(Productos pr: productosList){
                        pr.setCantidadExistente(inventariosList.stream().filter(x -> x.getIdProducto().equals(pr.getIdProducto())).collect(Collectors.toList()).stream()
                        .mapToInt(Inventarios::getCantidadExistente).sum());
                        productosListFinal.add(pr);
                    }
                }

            }
        }
        return productosListFinal;
    }

    @PostMapping()
    Productos save(@RequestBody Productos productos) {
        return restTemplate.postForObject(DOMAIN_URL, productos, Productos.class);
    }

    @PutMapping()
    Productos update(@RequestBody Productos productos) {
        return restTemplate.postForObject(DOMAIN_URL, productos, Productos.class);
    }
}
