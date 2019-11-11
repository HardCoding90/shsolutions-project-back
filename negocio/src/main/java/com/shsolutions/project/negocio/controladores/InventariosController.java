package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Inventarios;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/inventarios")
public class InventariosController {

    private final String DOMAIN_URL = DOMAIN + "inventarios";

    @GetMapping("/cascaron")
    Inventarios cascaron() {
        return new Inventarios();
    }

    @GetMapping("/findAll")
    List<Inventarios> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Inventarios[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Inventarios> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", Inventarios[].class));
    }

    @GetMapping("/findById/{id}")
    Inventarios findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, Inventarios.class);
    }

    @PostMapping("/saveAll")
    List<Inventarios> save(@RequestBody List<Inventarios> inventarios){
        return Arrays.asList(restTemplate.postForObject(DOMAIN_URL + "/saveAll", inventarios, Inventarios[].class));
    }

    @PostMapping("/sucursal/{idSucursal}")
    List<Inventarios> save(@PathVariable Integer idSucursal){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/sucursal/" + idSucursal, Inventarios[].class));
    }

    @PostMapping()
    Inventarios save(@RequestBody Inventarios inventarios){
        return restTemplate.postForObject(DOMAIN_URL , inventarios, Inventarios.class);
    }

    @PutMapping()
    Inventarios update(@RequestBody Inventarios inventarios){
        return restTemplate.postForObject(DOMAIN_URL , inventarios, Inventarios.class);
    }
}
