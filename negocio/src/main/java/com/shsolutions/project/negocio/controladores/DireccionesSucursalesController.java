package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.DireccionesSucursales;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/direccionesSucursales")
public class DireccionesSucursalesController {

    private final String DOMAIN_URL = DOMAIN + "direccionesSucursales";

    @GetMapping("/findAll")
    List<DireccionesSucursales> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", DireccionesSucursales[].class));
    }

    @GetMapping("/findAll/enabled")
    List<DireccionesSucursales> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", DireccionesSucursales[].class));
    }

    @GetMapping("/findById/{id}")
    DireccionesSucursales findAll(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, DireccionesSucursales.class);
    }

    @PostMapping()
    DireccionesSucursales save(@RequestBody DireccionesSucursales direccionesSucursales) {
        return restTemplate.postForObject(DOMAIN_URL, direccionesSucursales, DireccionesSucursales.class);
    }

    @PutMapping()
    DireccionesSucursales update(@RequestBody DireccionesSucursales direccionesSucursales) {
        return restTemplate.postForObject(DOMAIN_URL, direccionesSucursales, DireccionesSucursales.class);
    }

}
