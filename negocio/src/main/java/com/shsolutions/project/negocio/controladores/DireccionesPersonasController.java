package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.DireccionesPersonas;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/direccionesPersonas")
public class DireccionesPersonasController {

    private final String DOMAIN_URL = DOMAIN + "direccionesPersonas";

    @GetMapping("/findAll")
    List<DireccionesPersonas> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", DireccionesPersonas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<DireccionesPersonas> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",DireccionesPersonas[].class));
    }

    @GetMapping("/findById/{id}")
    DireccionesPersonas findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,DireccionesPersonas.class);
    }

    @PostMapping()
    DireccionesPersonas save(@RequestBody DireccionesPersonas direccionesPersonas) {
        return restTemplate.postForObject(DOMAIN_URL, direccionesPersonas, DireccionesPersonas.class);
    }

    @PutMapping()
    DireccionesPersonas update(@RequestBody DireccionesPersonas direccionesPersonas){
        return restTemplate.postForObject(DOMAIN_URL ,direccionesPersonas,DireccionesPersonas.class);
    }

}
