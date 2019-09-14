package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Paises;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/paises")
public class PaisesController {

    private String DOMAIN_URL = DOMAIN + "paises";

    @GetMapping("/findAll")
    List<Paises> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Paises[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Paises> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Paises[].class));
    }

    @GetMapping("/findById/{id}")
    Paises findAll(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Paises.class);
    }

    @PostMapping()
    Paises save(@RequestBody Paises paises) {
        return restTemplate.postForObject(DOMAIN_URL, paises, Paises.class);
    }

    @PutMapping()
    Paises update(@RequestBody Paises paises){
        return restTemplate.postForObject(DOMAIN_URL ,paises,Paises.class);
    }

}
