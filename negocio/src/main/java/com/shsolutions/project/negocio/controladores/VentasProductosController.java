package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.VentasProductos;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/ventasProductos")
public class VentasProductosController {

    private final String DOMAIN_URL = DOMAIN + "ventasProductos";

    @GetMapping("/findAll")
    List<VentasProductos> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", VentasProductos[].class));
    }

    @GetMapping("/findAll/enabled")
    List<VentasProductos> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", VentasProductos[].class));
    }

    @GetMapping("/findById/{id}")
    VentasProductos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, VentasProductos.class);
    }

    @PostMapping()
    VentasProductos save(@RequestBody VentasProductos ventasProductos) {
        return restTemplate.postForObject(DOMAIN_URL, ventasProductos, VentasProductos.class);
    }

    @PutMapping()
    VentasProductos update(@RequestBody VentasProductos ventasProductos) {
        return restTemplate.postForObject(DOMAIN_URL, ventasProductos, VentasProductos.class);
    }
}
