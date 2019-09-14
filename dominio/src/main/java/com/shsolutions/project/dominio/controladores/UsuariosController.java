package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Usuarios;
import com.shsolutions.project.dominio.repositorios.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/findAll")
    List<Usuarios> findAll() {
        return usuariosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Usuarios> findAllEnabled() {
        return usuariosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Usuarios findById(@PathVariable Integer id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Usuarios save(@RequestBody Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }
}
