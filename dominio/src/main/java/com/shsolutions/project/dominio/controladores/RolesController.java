package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Roles;
import com.shsolutions.project.dominio.repositorios.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolesController {

    @Autowired
    private RolesRepository rolesRepository;

    @GetMapping("/findAll")
    List<Roles> findAll() {
        return rolesRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Roles> findAllEnabled() {
        return rolesRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Roles findById(@PathVariable Integer id) {
        return rolesRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Roles save(@RequestBody Roles roles) {
        return rolesRepository.save(roles);
    }
}
