package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.TelefonosProveedores;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/telefonosProveedores")
public class TelefonosProveedoresController {

    private String DOMAIN_URL = DOMAIN + "telefonosProveedores";

    @GetMapping("/findAll")
    List<TelefonosProveedores> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", TelefonosProveedores[].class));
    }

    @GetMapping("/findAll/enabled")
    List<TelefonosProveedores> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", TelefonosProveedores[].class));
    }

    @GetMapping("/findById/{id}")
    TelefonosProveedores findAll(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, TelefonosProveedores.class);
    }

    @PostMapping()
    TelefonosProveedores save(@RequestBody TelefonosProveedores telefonosProveedores) {
        return restTemplate.postForObject(DOMAIN_URL, telefonosProveedores, TelefonosProveedores.class);
    }

    @PutMapping()
    TelefonosProveedores update(@RequestBody TelefonosProveedores telefonosProveedores) {
        return restTemplate.postForObject(DOMAIN_URL, telefonosProveedores, TelefonosProveedores.class);
    }

}
