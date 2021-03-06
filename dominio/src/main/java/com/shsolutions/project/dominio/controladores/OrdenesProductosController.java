package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.modelos.OrdenesProductos;
import com.shsolutions.project.dominio.repositorios.OrdenesProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordenesProductos")
public class OrdenesProductosController {

    @Autowired
    private OrdenesProductosRepository ordenesProductosRepository;

    @GetMapping("/findAll")
    List<OrdenesProductos> findAll() {
        return ordenesProductosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<OrdenesProductos> findAllEnabled() {
        return ordenesProductosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    OrdenesProductos findById(@PathVariable Integer id) {
        return ordenesProductosRepository.findById(id).orElse(null);
    }

    @GetMapping("/orden/{idOrden}")
    List<OrdenesProductos> findByIdOrden(@PathVariable Integer idOrden) {
        return ordenesProductosRepository.findAllByIndicadorHabilitadoTrueAndIdOrden(idOrden);
    }

    @PostMapping("/saveAll")
    List<OrdenesProductos> saveAll(@RequestBody List<OrdenesProductos> ordenesProductos) {
        ordenesProductos.forEach(this::configurarValoresPorDefecto);
        return ordenesProductosRepository.saveAll(ordenesProductos);
    }

    @PostMapping()
    OrdenesProductos save(@RequestBody OrdenesProductos ordenesProductos) {
        return ordenesProductosRepository.save(ordenesProductos);
    }

    private void configurarValoresPorDefecto(OrdenesProductos ordenesProductos){
        ordenesProductos.setIndicadorHabilitado(ordenesProductos.getIndicadorHabilitado() != null ? ordenesProductos.getIndicadorHabilitado() : true);
    }
}
