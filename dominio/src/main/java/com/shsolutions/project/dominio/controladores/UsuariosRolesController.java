package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.UsuariosRoles;
import com.shsolutions.project.dominio.repositorios.UsuariosRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuariosRoles")
public class UsuariosRolesController {

    @Autowired
    private UsuariosRolesRepository UsuariosRolesRepository;

    @GetMapping("/findAll")
    List<UsuariosRoles> findAll() {
        return UsuariosRolesRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<UsuariosRoles> findAllEnabled() {
        return UsuariosRolesRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    UsuariosRoles findById(@PathVariable Integer id) {
        return UsuariosRolesRepository.findById(id).orElse(null);
    }

    @PostMapping()
    UsuariosRoles save(@RequestBody UsuariosRoles usuariosRoles) {
        usuariosRoles.setIndicadorHabilitado(usuariosRoles.getIndicadorHabilitado() != null ? usuariosRoles.getIndicadorHabilitado() : true);
        return UsuariosRolesRepository.save(usuariosRoles);
    }
}
