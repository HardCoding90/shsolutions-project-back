package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.OrdenesProductos;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ordenesProductos")
public class OrdenesProductosController {

    private final String DOMAIN_URL = DOMAIN + "ordenesProductos";

    @GetMapping("/cascaron")
    OrdenesProductos cascaron() {
        return new OrdenesProductos();
    }

    @GetMapping("/findAll")
    List<OrdenesProductos> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", OrdenesProductos[].class));
    }

    @GetMapping("/findAll/enabled")
    List<OrdenesProductos> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", OrdenesProductos[].class));
    }

    @GetMapping("/findById/{id}")
    OrdenesProductos findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, OrdenesProductos.class);
    }

    @PostMapping("/saveAll")
    List<OrdenesProductos> save(@RequestBody List<OrdenesProductos> ordenesProductos) {
        return Arrays.asList(restTemplate.postForObject(DOMAIN_URL + "/saveAll", ordenesProductos, OrdenesProductos[].class));
    }

    @PostMapping()
    OrdenesProductos save(@RequestBody OrdenesProductos ordenesProductos) {
        return restTemplate.postForObject(DOMAIN_URL, ordenesProductos, OrdenesProductos.class);
    }

    @PutMapping()
    OrdenesProductos update(@RequestBody OrdenesProductos ordenesProductos) {
        return restTemplate.postForObject(DOMAIN_URL, ordenesProductos, OrdenesProductos.class);
    }
}
