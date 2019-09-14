package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.TelefonosSucursales;
import com.shsolutions.project.dominio.repositorios.TelefonosSucursalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/telefonosSucursales")
public class TelefonosSucursalesController {

    @Autowired
    private TelefonosSucursalesRepository telefonosSucursalesRepository;

    @GetMapping("/findAll")
    List<TelefonosSucursales> findAll() {
        return telefonosSucursalesRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<TelefonosSucursales> findAllEnabled() {
        return telefonosSucursalesRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    TelefonosSucursales findById(@PathVariable Integer id) {
        return telefonosSucursalesRepository.findById(id).orElse(null);
    }

    @PostMapping()
    TelefonosSucursales save(@RequestBody TelefonosSucursales telefonosSucursales) {
        return telefonosSucursalesRepository.save(telefonosSucursales);
    }
}
