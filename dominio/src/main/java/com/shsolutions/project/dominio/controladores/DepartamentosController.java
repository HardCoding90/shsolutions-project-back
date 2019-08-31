package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Departamentos;
import com.shsolutions.project.dominio.repositorios.DepartamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentosController {

    @Autowired
    private DepartamentosRepository departamentosRepository;

    @GetMapping("/findAll")
    List<Departamentos> findAll() {
        return departamentosRepository.findAll();
    }

    @PostMapping()
    Departamentos save(@RequestBody Departamentos departamentos) {
        return departamentosRepository.save(departamentos);
    }
}
