package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Telefonos;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/telefonos")
public class TelefonosController {

    private String DOMAIN_URL = DOMAIN + "telefonos";

    @GetMapping("/findAll")
    List<Telefonos> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Telefonos[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Telefonos> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Telefonos[].class));
    }

    @GetMapping("/findById/{id}")
    Telefonos findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Telefonos.class);
    }

    @PostMapping()
    Telefonos save(@RequestBody Telefonos telefonos) {
        return restTemplate.postForObject(DOMAIN_URL, telefonos, Telefonos.class);
    }

    @PutMapping()
    Telefonos update(@RequestBody Telefonos telefonos){
        return restTemplate.postForObject(DOMAIN_URL ,telefonos,Telefonos.class);
    }

}
