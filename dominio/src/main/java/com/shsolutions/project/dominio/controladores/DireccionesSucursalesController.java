package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.DireccionesSucursales;
import com.shsolutions.project.dominio.repositorios.DireccionesSucursalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direccionesSucursales")
public class DireccionesSucursalesController {

    @Autowired
    private DireccionesSucursalesRepository direccionesSucursalesRepository;

    @GetMapping("/findAll")
    List<DireccionesSucursales> findAll() {
        return direccionesSucursalesRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<DireccionesSucursales> findAllEnabled() {
        return direccionesSucursalesRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    DireccionesSucursales findById(@PathVariable Integer id) {
        return direccionesSucursalesRepository.findById(id).orElse(null);
    }

    @PostMapping()
    DireccionesSucursales save(@RequestBody DireccionesSucursales direccionesSucursales) {
        return direccionesSucursalesRepository.save(direccionesSucursales);
    }
}
