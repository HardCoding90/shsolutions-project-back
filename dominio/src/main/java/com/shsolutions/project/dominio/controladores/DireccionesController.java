package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Direcciones;
import com.shsolutions.project.dominio.modelos.Paises;
import com.shsolutions.project.dominio.repositorios.DireccionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direcciones")
public class DireccionesController {

    @Autowired
    private DireccionesRepository direccionesRepository;

    @GetMapping("/findAll")
    List<Direcciones> findAll() {
        return direccionesRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Direcciones> findAllEnabled() {
        return direccionesRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    Direcciones findById(@PathVariable Integer id) {
        return direccionesRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Direcciones save(@RequestBody Direcciones direcciones) {
        return direccionesRepository.save(direcciones);
    }
}
