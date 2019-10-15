package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.UsuariosRoles;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@CrossOrigin
@RestController
@RequestMapping("/api/usuariosRoles")
public class UsuariosRolesController {

    private String DOMAIN_URL = DOMAIN + "usuariosRoles";

    @GetMapping("/findAll")
    List<UsuariosRoles> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", UsuariosRoles[].class));
    }

    @GetMapping("/findAll/enabled")
    List<UsuariosRoles> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", UsuariosRoles[].class));
    }

    @GetMapping("/findById/{id}")
    UsuariosRoles findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, UsuariosRoles.class);
    }

    @PostMapping()
    UsuariosRoles save(@RequestBody UsuariosRoles usuariosRoles) {
        return restTemplate.postForObject(DOMAIN_URL, usuariosRoles, UsuariosRoles.class);
    }

    @PutMapping()
    UsuariosRoles update(@RequestBody UsuariosRoles usuariosRoles) {
        return restTemplate.postForObject(DOMAIN_URL, usuariosRoles, UsuariosRoles.class);
    }

}
