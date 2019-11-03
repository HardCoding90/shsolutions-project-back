package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Personas;
import com.shsolutions.project.dominio.repositorios.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonasController {

    @Autowired
    private PersonasRepository personasRepository;

    @GetMapping("/findAll")
    List<Personas> findAll() {
        return personasRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Personas> findAllEnabled() {
        return personasRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Personas findById(@PathVariable Integer id) {
        return personasRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Personas save(@RequestBody Personas personas) {
        personas.setFechaRegistro(personas.getFechaRegistro() != null ? personas.getFechaRegistro() : LocalDate.now());
        return personasRepository.save(personas);
    }
}
