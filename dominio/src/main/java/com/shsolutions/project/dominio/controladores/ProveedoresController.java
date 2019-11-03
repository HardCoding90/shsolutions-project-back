package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Proveedores;
import com.shsolutions.project.dominio.repositorios.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedoresController {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @GetMapping("/findAll")
    List<Proveedores> findAll() {
        return proveedoresRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Proveedores> findAllEnabled() {
        return proveedoresRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Proveedores findById(@PathVariable Integer id) {
        return proveedoresRepository.findById(id).orElse(null);
    }

    @PostMapping("/saveAll")
    List<Proveedores> saveAll(@RequestBody List<Proveedores> proveedores){
        proveedores.forEach(this::configurarValoresPorDefecto);
        return proveedoresRepository.saveAll(proveedores);
    }

    @PostMapping()
    Proveedores save(@RequestBody Proveedores proveedores) {
        configurarValoresPorDefecto(proveedores);
        return proveedoresRepository.save(proveedores);
    }

    private void configurarValoresPorDefecto(Proveedores proveedores){
        proveedores.setFechaRegistro(proveedores.getFechaRegistro() != null ? proveedores.getFechaRegistro() : LocalDate.now());
    }
}
