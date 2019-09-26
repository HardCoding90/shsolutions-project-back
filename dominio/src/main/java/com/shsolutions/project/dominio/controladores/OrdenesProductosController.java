package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.OrdenesProductos;
import com.shsolutions.project.dominio.repositorios.OrdenesProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordenesProductos")
public class OrdenesProductosController {

    @Autowired
    private OrdenesProductosRepository ordenesProductosRepository;

    @GetMapping("/findAll")
    List<OrdenesProductos> findAll() {
        return ordenesProductosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<OrdenesProductos> findAllEnabled() {
        return ordenesProductosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    OrdenesProductos findById(@PathVariable Integer id) {
        return ordenesProductosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    OrdenesProductos save(@RequestBody OrdenesProductos ordenes) {
        return ordenesProductosRepository.save(ordenes);
    }
}
