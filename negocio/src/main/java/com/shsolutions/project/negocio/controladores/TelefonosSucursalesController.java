package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.TelefonosSucursales;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@CrossOrigin
@RestController
@RequestMapping("/api/telefonosSucursales")
public class TelefonosSucursalesController {

    private String DOMAIN_URL = DOMAIN + "telefonosSucursales";

    @GetMapping("/findAll")
    List<TelefonosSucursales> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", TelefonosSucursales[].class));
    }

    @GetMapping("/findAll/enabled")
    List<TelefonosSucursales> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", TelefonosSucursales[].class));
    }

    @GetMapping("/findById/{id}")
    TelefonosSucursales findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, TelefonosSucursales.class);
    }

    @PostMapping()
    TelefonosSucursales save(@RequestBody TelefonosSucursales telefonosSucursales) {
        return restTemplate.postForObject(DOMAIN_URL, telefonosSucursales, TelefonosSucursales.class);
    }

    @PutMapping()
    TelefonosSucursales update(@RequestBody TelefonosSucursales telefonosSucursales) {
        return restTemplate.postForObject(DOMAIN_URL, telefonosSucursales, TelefonosSucursales.class);
    }

}
