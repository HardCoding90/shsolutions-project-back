package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.ProductosProveedores;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/productosProveedores")
public class ProductosProveedoresController {

    private final String DOMAIN_URL = DOMAIN + "productosProveedores";

    @GetMapping("/findAll")
    List<ProductosProveedores> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", ProductosProveedores[].class));
    }

    @GetMapping("/findAll/enabled")
    List<ProductosProveedores> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", ProductosProveedores[].class));
    }

    @GetMapping("/findById/{id}")
    ProductosProveedores findAll(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, ProductosProveedores.class);
    }

    @PostMapping()
    ProductosProveedores save(@RequestBody ProductosProveedores productosProveedores) {
        return restTemplate.postForObject(DOMAIN_URL, productosProveedores, ProductosProveedores.class);
    }

    @PutMapping()
    ProductosProveedores update(@RequestBody ProductosProveedores productosProveedores) {
        return restTemplate.postForObject(DOMAIN_URL, productosProveedores, ProductosProveedores.class);
    }
}
