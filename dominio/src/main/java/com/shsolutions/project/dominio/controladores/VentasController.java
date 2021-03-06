package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Ventas;
import com.shsolutions.project.dominio.repositorios.VentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {

    @Autowired
    private VentasRepository ventasRepository;

    @GetMapping("/findAll")
    List<Ventas> findAll() {
        return ventasRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Ventas> findAllEnabled() {
        return ventasRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Ventas findById(@PathVariable Integer id) {
        return ventasRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Ventas save(@RequestBody Ventas ventas) {
        configurarValoresPorDefecto(ventas);
        return ventasRepository.save(ventas);
    }

    private void configurarValoresPorDefecto(Ventas ventas){
        ventas.setFechaVenta(ventas.getFechaVenta() != null ? ventas.getFechaVenta() : LocalDateTime.now());
        ventas.setIndicadorHabilitado(ventas.getIndicadorHabilitado() != null ? ventas.getIndicadorHabilitado() : true);
    }
}
