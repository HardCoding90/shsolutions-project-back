package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Pruebas;
import com.shsolutions.project.dominio.repositorios.PruebasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/api/pruebas")
public class PruebasController {

    @Autowired
    private PruebasRepository pruebasRepository;

    @GetMapping("/findAll")
    List<Pruebas> findAll(){
        return  pruebasRepository.findAll();
    }

    @PostMapping()
    Pruebas save(@RequestBody Pruebas prueba){
        return  pruebasRepository.save(prueba);
    }
}
