package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Usuarios;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    private String DOMAIN_URL = DOMAIN + "usuarios";

    @GetMapping("/cascaron")
    Usuarios cascaron() {
        return new Usuarios();
    }

    @GetMapping("/findAll")
    List<Usuarios> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Usuarios[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Usuarios> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", Usuarios[].class));
    }

    @GetMapping("/findById/{id}")
    Usuarios findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, Usuarios.class);
    }

    @PostMapping()
    Usuarios save(@RequestBody Usuarios usuarios) {
        return restTemplate.postForObject(DOMAIN_URL, usuarios, Usuarios.class);
    }

    @PutMapping()
    Usuarios update(@RequestBody Usuarios usuarios) {
        return restTemplate.postForObject(DOMAIN_URL, usuarios, Usuarios.class);
    }

    @PostMapping("/autorizarIngreso")
    Boolean verifyPassword(@RequestBody Usuarios usuarios) {
        return restTemplate.postForObject(DOMAIN_URL + "/autorizarIngreso", usuarios, Boolean.class);
    }
}
