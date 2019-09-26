package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Bodegas;
import com.shsolutions.project.dominio.repositorios.BodegasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bodegas")
public class BodegasController {

    @Autowired
    private BodegasRepository bodegasRepository;

    @GetMapping("/findAll")
    List<Bodegas> findAll() {
        return bodegasRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Bodegas> findAllEnabled() {
        return bodegasRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Bodegas findById(@PathVariable Integer id) {
        return bodegasRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Bodegas save(@RequestBody Bodegas bodegas) {
        return bodegasRepository.save(bodegas);
    }
}
