package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Personas;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/personas")
public class PersonasController {

    private final String DOMAIN_URL = DOMAIN + "personas";

    @GetMapping("/findAll")
    List<Personas> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Personas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Personas> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Personas[].class));
    }

    @GetMapping("/findById/{id}")
    Personas findAll(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Personas.class);
    }

    @PostMapping()
    Personas save(@RequestBody Personas personas){
        return restTemplate.postForObject(DOMAIN_URL ,personas,Personas.class);
    }

    @PutMapping()
    Personas update(@RequestBody Personas personas){
        return restTemplate.postForObject(DOMAIN_URL ,personas,Personas.class);
    }

}
