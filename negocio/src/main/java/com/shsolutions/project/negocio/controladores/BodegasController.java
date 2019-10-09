package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Bodegas;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/bodegas")
public class BodegasController {

    private final String DOMAIN_URL = DOMAIN + "bodegas";

    @GetMapping("/findAll")
    List<Bodegas> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Bodegas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Bodegas> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Bodegas[].class));
    }

    @GetMapping("/findById/{id}")
    Bodegas findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Bodegas.class);
    }

    @PostMapping()
    Bodegas save(@RequestBody Bodegas bodegas){
        return restTemplate.postForObject(DOMAIN_URL ,bodegas,Bodegas.class);
    }

    @PutMapping()
    Bodegas update(@RequestBody Bodegas bodegas){
        return restTemplate.postForObject(DOMAIN_URL ,bodegas,Bodegas.class);
    }
}
