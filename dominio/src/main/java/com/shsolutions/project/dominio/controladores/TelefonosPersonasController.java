package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.TelefonosPersonas;
import com.shsolutions.project.dominio.repositorios.TelefonosPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/telefonosPersonas")
public class TelefonosPersonasController {

    @Autowired
    private TelefonosPersonasRepository telefonosPersonasRepository;

    @GetMapping("/findAll")
    List<TelefonosPersonas> findAll() {
        return telefonosPersonasRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<TelefonosPersonas> findAllEnabled() {
        return telefonosPersonasRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    TelefonosPersonas findById(@PathVariable Integer id) {
        return telefonosPersonasRepository.findById(id).orElse(null);
    }

    @PostMapping()
    TelefonosPersonas save(@RequestBody TelefonosPersonas telefonosPersonas) {
        return telefonosPersonasRepository.save(telefonosPersonas);
    }
}
