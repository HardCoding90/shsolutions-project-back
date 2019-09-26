package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Ivas;
import com.shsolutions.project.dominio.repositorios.IvasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ivas")
public class IvasController {

    @Autowired
    private IvasRepository ivasRepository;

    @GetMapping("/findAll")
    List<Ivas> findAll() {
        return ivasRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Ivas> findAllEnabled() {
        return ivasRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Ivas findById(@PathVariable Integer id) {
        return ivasRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Ivas save(@RequestBody Ivas ivas) {
        return ivasRepository.save(ivas);
    }
}
