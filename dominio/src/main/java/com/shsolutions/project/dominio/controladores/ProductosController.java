package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.Productos;
import com.shsolutions.project.dominio.repositorios.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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

    @PostMapping("/saveAll")
    List<Productos> saveAll(@RequestBody List<Productos> productos){
        return productosRepository.saveAll(productos);
    }

    @PostMapping()
    Productos save(@RequestBody Productos productos) {
        return productosRepository.save(productos);
    }
}
