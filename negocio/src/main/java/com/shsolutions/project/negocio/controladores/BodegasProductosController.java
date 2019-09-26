package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.BodegasProductos;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin
@RequestMapping("/api/bodegasProductos")
public class BodegasProductosController {

    private final String DOMAIN_URL = DOMAIN + "bodegasProductos";

    @GetMapping("/findAll")
    List<BodegasProductos> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",BodegasProductos[].class));
    }

    @GetMapping("/findAll/enabled")
    List<BodegasProductos> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",BodegasProductos[].class));
    }

    @GetMapping("/findById/{id}")
    BodegasProductos findAll(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,BodegasProductos.class);
    }

    @PostMapping()
    BodegasProductos save(@RequestBody BodegasProductos bodegasProductos){
        return restTemplate.postForObject(DOMAIN_URL ,bodegasProductos,BodegasProductos.class);
    }

    @PutMapping()
    BodegasProductos update(@RequestBody BodegasProductos bodegasProductos){
        return restTemplate.postForObject(DOMAIN_URL ,bodegasProductos,BodegasProductos.class);
    }
}
