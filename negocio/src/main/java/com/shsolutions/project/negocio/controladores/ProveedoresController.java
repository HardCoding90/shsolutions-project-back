package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Proveedores;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/proveedores")
public class ProveedoresController {

    private String DOMAIN_URL = DOMAIN + "proveedores";

    @GetMapping("/findAll")
    List<Proveedores> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Proveedores[].class));
    }
    @GetMapping("/cascaron")
    Proveedores cascaron() {
        return new Proveedores();
    }

    @GetMapping("/findAll/enabled")
    List<Proveedores> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Proveedores[].class));
    }

    @GetMapping("/findById/{id}")
    Proveedores findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Proveedores.class);
    }

    @PostMapping("/saveAll")
    List<Proveedores> saveAll(@RequestBody List<Proveedores> proveedores) {
        return Arrays.asList(restTemplate.postForObject(DOMAIN_URL + "/saveAll", proveedores, Proveedores[].class));
    }

    @PostMapping()
    Proveedores save(@RequestBody Proveedores proveedores) {
        return restTemplate.postForObject(DOMAIN_URL, proveedores, Proveedores.class);
    }

    @PutMapping()
    Proveedores update(@RequestBody Proveedores proveedores){
        return restTemplate.postForObject(DOMAIN_URL ,proveedores,Proveedores.class);
    }

}
