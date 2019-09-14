package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.TelefonosPersonas;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/telefonosPersonas")
public class TelefonosPersonasController {

    private String DOMAIN_URL = DOMAIN + "telefonosPersonas";

    @GetMapping("/findAll")
    List<TelefonosPersonas> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", TelefonosPersonas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<TelefonosPersonas> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", TelefonosPersonas[].class));
    }

    @GetMapping("/findById/{id}")
    TelefonosPersonas findAll(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, TelefonosPersonas.class);
    }

    @PostMapping()
    TelefonosPersonas save(@RequestBody TelefonosPersonas telefonosPersonas) {
        return restTemplate.postForObject(DOMAIN_URL, telefonosPersonas, TelefonosPersonas.class);
    }

    @PutMapping()
    TelefonosPersonas update(@RequestBody TelefonosPersonas telefonosPersonas) {
        return restTemplate.postForObject(DOMAIN_URL, telefonosPersonas, TelefonosPersonas.class);
    }

}
