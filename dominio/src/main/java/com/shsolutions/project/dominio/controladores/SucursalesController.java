package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Sucursales;
import com.shsolutions.project.dominio.repositorios.SucursalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sucursales")
public class SucursalesController {

    @Autowired
    private SucursalesRepository sucursalesRepository;

    @GetMapping("/findAll")
    List<Sucursales> findAll() {
        return sucursalesRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Sucursales> findAllEnabled() {
        return sucursalesRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Sucursales findById(@PathVariable Integer id) {
        return sucursalesRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Sucursales save(@RequestBody Sucursales sucursales) {
        return sucursalesRepository.save(sucursales);
    }
}
