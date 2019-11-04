package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Inventarios;
import com.shsolutions.project.dominio.modelos.OrdenesProductos;
import com.shsolutions.project.dominio.repositorios.InventariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventarios")
public class InventariosController {

    @Autowired
    private InventariosRepository inventariosRepository;

    @GetMapping("/findAll")
    List<Inventarios> findAll() {
        return inventariosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Inventarios> findAllEnabled() {
        return inventariosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Inventarios findById(@PathVariable Integer id) {
        return inventariosRepository.findById(id).orElse(null);
    }

    @PostMapping("/saveAll")
    List<Inventarios> saveAll(@RequestBody List<Inventarios> inventarios) {
        inventarios.forEach(this::configurarValoresPorDefecto);
        return inventariosRepository.saveAll(inventarios);
    }

    @PostMapping()
    Inventarios save(@RequestBody Inventarios inventarios) {
        return inventariosRepository.save(inventarios);
    }

    private void configurarValoresPorDefecto(Inventarios inventarios){
        inventarios.setIndicadorHabilitado(inventarios.getIndicadorHabilitado() != null ? inventarios.getIndicadorHabilitado() : true);
    }
}
