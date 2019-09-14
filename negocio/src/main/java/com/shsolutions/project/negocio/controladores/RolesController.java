package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Roles;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@RequestMapping("/api/roles")
public class RolesController {

    private String DOMAIN_URL = DOMAIN + "roles";

    @GetMapping("/findAll")
    List<Roles> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Roles[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Roles> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Roles[].class));
    }

    @GetMapping("/findById/{id}")
    Roles findAll(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Roles.class);
    }

    @PostMapping()
    Roles save(@RequestBody Roles roles) {
        return restTemplate.postForObject(DOMAIN_URL, roles, Roles.class);
    }

    @PutMapping()
    Roles update(@RequestBody Roles roles){
        return restTemplate.postForObject(DOMAIN_URL ,roles,Roles.class);
    }

}
