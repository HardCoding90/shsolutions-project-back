package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Paises;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.*;

@RestController
@RequestMapping("/api/paises")
public class PaisesController {

    private String DOMAIN_URL = DOMAIN + "paises";

    @GetMapping("/findAll")
    List<Paises> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Paises[].class));
    }

    @PostMapping()
    Paises save(@RequestBody Paises paises) {
        return restTemplate.postForObject(DOMAIN_URL, paises, Paises.class);
    }

}
