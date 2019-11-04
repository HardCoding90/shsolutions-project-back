package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.VentasProductos;
import com.shsolutions.project.dominio.repositorios.VentasProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventasProductos")
public class VentasProductosController {

    @Autowired
    private VentasProductosRepository ventasProductosRepository;

    @GetMapping("/findAll")
    List<VentasProductos> findAll() {
        return ventasProductosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<VentasProductos> findAllEnabled() {
        return ventasProductosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    VentasProductos findById(@PathVariable Integer id) {
        return ventasProductosRepository.findById(id).orElse(null);
    }

    @PostMapping("/saveAll")
    List<VentasProductos> save(@RequestBody List<VentasProductos> ventasProductos) {
        ventasProductos.forEach(this::configurarValoresPorDefecto);
        return ventasProductosRepository.saveAll(ventasProductos);
    }

    @PostMapping()
    VentasProductos save(@RequestBody VentasProductos ventasProductos) {
        configurarValoresPorDefecto(ventasProductos);
        return ventasProductosRepository.save(ventasProductos);
    }

    private void configurarValoresPorDefecto(VentasProductos ventasProductos){
        ventasProductos.setIndicadorHabilitado(ventasProductos.getIndicadorHabilitado() != null ? ventasProductos.getIndicadorHabilitado() : true);
    }
}
