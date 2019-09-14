package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.DireccionesPersonas;
import com.shsolutions.project.dominio.repositorios.DireccionesPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direccionesPersonas")
public class DireccionesPersonasController {

    @Autowired
    private DireccionesPersonasRepository direccionesPersonasRepository;

    @GetMapping("/findAll")
    List<DireccionesPersonas> findAll() {
        return direccionesPersonasRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<DireccionesPersonas> findAllEnabled() {
        return direccionesPersonasRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    DireccionesPersonas findById(@PathVariable Integer id) {
        return direccionesPersonasRepository.findById(id).orElse(null);
    }

    @PostMapping()
    DireccionesPersonas save(@RequestBody DireccionesPersonas direccionesPersonas) {
        return direccionesPersonasRepository.save(direccionesPersonas);
    }
}
