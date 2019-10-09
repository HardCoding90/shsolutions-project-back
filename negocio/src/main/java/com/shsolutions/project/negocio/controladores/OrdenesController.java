package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Ordenes;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/ordenes")
public class OrdenesController {

    private final String DOMAIN_URL = DOMAIN + "ordenes";

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
        return restTemplate.postForObject(DOMAIN_URL, ordenes, Ordenes.class);
    }

    @PutMapping()
    Ordenes update(@RequestBody Ordenes ordenes) {
        return restTemplate.postForObject(DOMAIN_URL, ordenes, Ordenes.class);
    }
}
