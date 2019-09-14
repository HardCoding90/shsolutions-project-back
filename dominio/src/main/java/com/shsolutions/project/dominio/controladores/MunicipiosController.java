package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Municipios;
import com.shsolutions.project.dominio.repositorios.MunicipiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/municipios")
public class MunicipiosController {

    @Autowired
    private MunicipiosRepository departamentosRepository;

    @GetMapping("/findAll")
    List<Municipios> findAll() {
        return departamentosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Municipios> findAllEnabled() {
        return departamentosRepository.findAllByIndicadorHabilitado();
    }

    @GetMapping("/findById/{id}")
    Municipios findById(@PathVariable Integer id) {
        return departamentosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Municipios save(@RequestBody Municipios municipios) {
        return departamentosRepository.save(municipios);
    }
}
