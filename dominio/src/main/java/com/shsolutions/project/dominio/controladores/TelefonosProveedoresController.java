package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.TelefonosProveedores;
import com.shsolutions.project.dominio.repositorios.TelefonosProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/telefonosProveedores")
public class TelefonosProveedoresController {

    @Autowired
    private TelefonosProveedoresRepository telefonosProveedoresRepository;

    @GetMapping("/findAll")
    List<TelefonosProveedores> findAll() {
        return telefonosProveedoresRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<TelefonosProveedores> findAllEnabled() {
        return telefonosProveedoresRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    TelefonosProveedores findById(@PathVariable Integer id) {
        return telefonosProveedoresRepository.findById(id).orElse(null);
    }

    @PostMapping()
    TelefonosProveedores save(@RequestBody TelefonosProveedores telefonosProveedores) {
        return telefonosProveedoresRepository.save(telefonosProveedores);
    }
}
