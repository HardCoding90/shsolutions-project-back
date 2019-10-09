package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Productos;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/productos")
public class ProductosController {

    private final String DOMAIN_URL = DOMAIN + "productos";

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

    @PostMapping()
    Productos save(@RequestBody Productos productos) {
        return restTemplate.postForObject(DOMAIN_URL, productos, Productos.class);
    }

    @PutMapping()
    Productos update(@RequestBody Productos productos) {
        return restTemplate.postForObject(DOMAIN_URL, productos, Productos.class);
    }
}
