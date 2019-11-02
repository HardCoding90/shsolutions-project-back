package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.ProductosProveedores;
import com.shsolutions.project.dominio.repositorios.ProductosProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productosProveedores")
public class ProductosProveedoresController {

    @Autowired
    private ProductosProveedoresRepository productosProveedoresRepository;

    @GetMapping("/findAll")
    List<ProductosProveedores> findAll() {
        return productosProveedoresRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<ProductosProveedores> findAllEnabled() {
        return productosProveedoresRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    ProductosProveedores findById(@PathVariable Integer id) {
        return productosProveedoresRepository.findById(id).orElse(null);
    }

    @PostMapping("/saveAll")
    List<ProductosProveedores> save(@RequestBody List<ProductosProveedores> productosProveedoresList) {
        return productosProveedoresRepository.saveAll(productosProveedoresList);
    }

    @PostMapping()
    ProductosProveedores save(@RequestBody ProductosProveedores productosProveedores) {
        return productosProveedoresRepository.save(productosProveedores);
    }
}
