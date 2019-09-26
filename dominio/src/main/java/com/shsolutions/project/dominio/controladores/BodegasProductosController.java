package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.BodegasProductos;
import com.shsolutions.project.dominio.repositorios.BodegasProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bodegasProductos")
public class BodegasProductosController {

    @Autowired
    private BodegasProductosRepository bodegasProductosRepository;

    @GetMapping("/findAll")
    List<BodegasProductos> findAll() {
        return bodegasProductosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<BodegasProductos> findAllEnabled() {
        return bodegasProductosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    BodegasProductos findById(@PathVariable Integer id) {
        return bodegasProductosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    BodegasProductos save(@RequestBody BodegasProductos bodegasProductos) {
        return bodegasProductosRepository.save(bodegasProductos);
    }
}
