package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Inventarios;
import com.shsolutions.project.dominio.repositorios.InventariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventarios")
public class InventariosController {

    @Autowired
    private InventariosRepository inventariosRepository;

    @GetMapping("/findAll")
    List<Inventarios> findAll() {
        return inventariosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Inventarios> findAllEnabled() {
        return inventariosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Inventarios findById(@PathVariable Integer id) {
        return inventariosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Inventarios save(@RequestBody Inventarios inventarios) {
        return inventariosRepository.save(inventarios);
    }
}
