package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Ordenes;
import com.shsolutions.project.dominio.modelos.Paises;
import com.shsolutions.project.dominio.repositorios.OrdenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/ordenes")
public class OrdenesController {

    @Autowired
    private OrdenesRepository ordenesRepository;

    @GetMapping("/findAll")
    List<Ordenes> findAll() {
        return ordenesRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Ordenes> findAllEnabled() {
        return ordenesRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Ordenes findById(@PathVariable Integer id) {
        return ordenesRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Ordenes save(@RequestBody Ordenes ordenes) {
        return ordenesRepository.save(ordenes);
    }
}
