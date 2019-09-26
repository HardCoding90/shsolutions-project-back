package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Ventas;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/ventas")
public class VentasController {

    private final String DOMAIN_URL = DOMAIN + "ventas";

    @GetMapping("/findAll")
    List<Ventas> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Ventas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Ventas> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", Ventas[].class));
    }

    @GetMapping("/findById/{id}")
    Ventas findAll(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, Ventas.class);
    }

    @PostMapping()
    Ventas save(@RequestBody Ventas ventas) {
        return restTemplate.postForObject(DOMAIN_URL, ventas, Ventas.class);
    }

    @PutMapping()
    Ventas update(@RequestBody Ventas ventas) {
        return restTemplate.postForObject(DOMAIN_URL, ventas, Ventas.class);
    }
}
