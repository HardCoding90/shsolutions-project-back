package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Facturas;
import com.shsolutions.project.dominio.repositorios.FacturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturasController {

    @Autowired
    private FacturasRepository facturasRepository;

    @GetMapping("/findAll")
    List<Facturas> findAll() {
        return facturasRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Facturas> findAllEnabled() {
        return facturasRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Facturas findById(@PathVariable Integer id) {
        return facturasRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Facturas save(@RequestBody Facturas facturas) {
        return facturasRepository.save(facturas);
    }
}
