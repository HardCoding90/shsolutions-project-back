package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Paises;
import com.shsolutions.project.negocio.utilidades.Utilidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisesController {

    @Autowired
    RestTemplate restTemplate;

    private String DOMAIN_URL = Utilidades.DOMAIN + "departamentos";

    @GetMapping("/findAll")
    List<Paises> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Paises[].class));
    }

    @PostMapping()
    Paises save(@RequestBody Paises paises){
        return restTemplate.postForObject(DOMAIN_URL ,paises,Paises.class);
    }

}
