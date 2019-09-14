package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Generos;
import com.shsolutions.project.dominio.repositorios.GenerosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/generos")
public class GenerosController {

    @Autowired
    private GenerosRepository generosRepository;

    @GetMapping("/findAll")
    List<Generos> findAll() {
        return generosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Generos> findAllEnabled() {
        return generosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Generos findById(@PathVariable Integer id) {
        return generosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Generos save(@RequestBody Generos generos) {
        return generosRepository.save(generos);
    }
}
