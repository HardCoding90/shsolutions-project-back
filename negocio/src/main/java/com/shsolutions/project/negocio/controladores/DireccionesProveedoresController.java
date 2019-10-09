package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.DireccionesProveedores;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/direccionesProveedores")
public class DireccionesProveedoresController {

    private final String DOMAIN_URL = DOMAIN + "direccionesProveedores";

    @GetMapping("/findAll")
    List<DireccionesProveedores> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", DireccionesProveedores[].class));
    }

    @GetMapping("/findAll/enabled")
    List<DireccionesProveedores> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", DireccionesProveedores[].class));
    }

    @GetMapping("/findById/{id}")
    DireccionesProveedores findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, DireccionesProveedores.class);
    }

    @PostMapping()
    DireccionesProveedores save(@RequestBody DireccionesProveedores direccionesProveedores) {
        return restTemplate.postForObject(DOMAIN_URL, direccionesProveedores, DireccionesProveedores.class);
    }

    @PutMapping()
    DireccionesProveedores update(@RequestBody DireccionesProveedores direccionesProveedores) {
        return restTemplate.postForObject(DOMAIN_URL, direccionesProveedores, DireccionesProveedores.class);
    }

}
