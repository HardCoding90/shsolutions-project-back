package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Municipios;
import com.shsolutions.project.negocio.utilidades.Utilidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import static com.shsolutions.project.negocio.utilidades.Utilidades.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/municipios")
public class MunicipiosController {

    private final String DOMAIN_URL = DOMAIN + "municipios";

    @GetMapping("/findAll")
    List<Municipios> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Municipios[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Municipios> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Municipios[].class));
    }

    @GetMapping("/findById/{id}")
    Municipios findAll(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Municipios.class);
    }

    @PostMapping()
    Municipios save(@RequestBody Municipios paises){
        return restTemplate.postForObject(DOMAIN_URL ,paises,Municipios.class);
    }

    @PutMapping()
    Municipios update(@RequestBody Municipios municipios){
        return restTemplate.postForObject(DOMAIN_URL ,municipios,Municipios.class);
    }

}
