package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Departamentos;
import com.shsolutions.project.negocio.utilidades.Utilidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentosController {

    @Autowired
    RestTemplate restTemplate;

    private String DOMAIN_URL = Utilidades.DOMAIN + "departamentos";

    @GetMapping("/findAll")
    List<Departamentos> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Departamentos[].class));
    }

    @PostMapping()
    Departamentos save(@RequestBody Departamentos departamentos){
        return restTemplate.postForObject(DOMAIN_URL ,departamentos,Departamentos.class);
    }

}
