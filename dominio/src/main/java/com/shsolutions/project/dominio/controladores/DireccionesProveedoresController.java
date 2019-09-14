package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.DireccionesProveedores;
import com.shsolutions.project.dominio.repositorios.DireccionesProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direccionesProveedores")
public class DireccionesProveedoresController {

    @Autowired
    private DireccionesProveedoresRepository direccionesProveedoresRepository;

    @GetMapping("/findAll")
    List<DireccionesProveedores> findAll() {
        return direccionesProveedoresRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<DireccionesProveedores> findAllEnabled() {
        return direccionesProveedoresRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    DireccionesProveedores findById(@PathVariable Integer id) {
        return direccionesProveedoresRepository.findById(id).orElse(null);
    }

    @PostMapping()
    DireccionesProveedores save(@RequestBody DireccionesProveedores direccionesPersonas) {
        return direccionesProveedoresRepository.save(direccionesPersonas);
    }
}
