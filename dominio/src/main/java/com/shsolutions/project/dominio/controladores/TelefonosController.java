package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Telefonos;
import com.shsolutions.project.dominio.repositorios.TelefonosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/telefonos")
public class TelefonosController {

    @Autowired
    private TelefonosRepository telefonosRepository;

    @GetMapping("/findAll")
    List<Telefonos> findAll() {
        return telefonosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Telefonos> findAllEnabled() {
        return telefonosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Telefonos findById(@PathVariable Integer id) {
        return telefonosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Telefonos save(@RequestBody Telefonos telefonos) {
        return telefonosRepository.save(telefonos);
    }
}
