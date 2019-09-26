package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Productos;
import com.shsolutions.project.dominio.repositorios.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/productos")
public class ProductosController {

    @Autowired
    private ProductosRepository productosRepository;

    @GetMapping("/findAll")
    List<Productos> findAll() {
        return productosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Productos> findAllEnabled() {
        return productosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Productos findById(@PathVariable Integer id) {
        return productosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Productos save(@RequestBody Productos productos) {
        return productosRepository.save(productos);
    }
}
