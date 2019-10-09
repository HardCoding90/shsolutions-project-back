package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Facturas;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/facturas")
public class FacturasController {

    private final String DOMAIN_URL = DOMAIN + "facturas";

    @GetMapping("/findAll")
    List<Facturas> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Facturas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Facturas> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Facturas[].class));
    }

    @GetMapping("/findById/{id}")
    Facturas findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Facturas.class);
    }

    @PostMapping()
    Facturas save(@RequestBody Facturas facturas){
        return restTemplate.postForObject(DOMAIN_URL ,facturas,Facturas.class);
    }

    @PutMapping()
    Facturas update(@RequestBody Facturas facturas){
        return restTemplate.postForObject(DOMAIN_URL ,facturas,Facturas.class);
    }
}
