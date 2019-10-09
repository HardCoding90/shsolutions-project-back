package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Paises;
import com.shsolutions.project.dominio.repositorios.PaisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisesController {

    @Autowired
    private PaisesRepository paisesRepository;

    @GetMapping("/findAll")
    List<Paises> findAll() {
        return paisesRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Paises> findAllEnabled() {
        return paisesRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Paises findById(@PathVariable Integer id) {
        return paisesRepository.findById(id).orElse(null);
    }
    
    @PostMapping()
    Paises save(@RequestBody Paises paises) {
        return paisesRepository.save(paises);
    }
}
