package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Generos;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@CrossOrigin
@RestController
@RequestMapping("/api/generos")
public class GenerosController {

    private final String DOMAIN_URL = DOMAIN + "generos";

    @GetMapping("/findAll")
    List<Generos> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Generos[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Generos> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Generos[].class));
    }

    @GetMapping("/findById/{id}")
    Generos findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Generos.class);
    }

    @PostMapping()
    Generos save(@RequestBody Generos generos){
        return restTemplate.postForObject(DOMAIN_URL ,generos,Generos.class);
    }

    @PutMapping()
    Generos update(@RequestBody Generos generos){
        return restTemplate.postForObject(DOMAIN_URL ,generos,Generos.class);
    }
}
