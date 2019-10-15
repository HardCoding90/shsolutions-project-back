package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Sucursales;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@CrossOrigin
@RestController
@RequestMapping("/api/sucursales")
public class SucursalesController {

    private String DOMAIN_URL = DOMAIN + "sucursales";

    @GetMapping("/findAll")
    List<Sucursales> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Sucursales[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Sucursales> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Sucursales[].class));
    }

    @GetMapping("/findById/{id}")
    Sucursales findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Sucursales.class);
    }

    @PostMapping()
    Sucursales save(@RequestBody Sucursales sucursales) {
        return restTemplate.postForObject(DOMAIN_URL, sucursales, Sucursales.class);
    }

    @PutMapping()
    Sucursales update(@RequestBody Sucursales sucursales){
        return restTemplate.postForObject(DOMAIN_URL ,sucursales,Sucursales.class);
    }

}
