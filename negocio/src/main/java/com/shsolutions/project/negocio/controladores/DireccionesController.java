package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Direcciones;
import com.shsolutions.project.negocio.modelos.Paises;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/direcciones")
public class DireccionesController {

    private String DOMAIN_URL = DOMAIN + "direcciones";

    @GetMapping("/findAll")
    List<Direcciones> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Direcciones[].class));
    }

    @PostMapping()
    Direcciones save(@RequestBody Direcciones paises) {
        return restTemplate.postForObject(DOMAIN_URL, paises, Direcciones.class);
    }

}
