package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Departamentos;
import com.shsolutions.project.negocio.utilidades.Utilidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import static com.shsolutions.project.negocio.utilidades.Utilidades.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/departamentos")
public class DepartamentosController {

    private final String DOMAIN_URL = DOMAIN + "departamentos";

    @GetMapping("/cascaron")
    Departamentos cascaron() {
        return new Departamentos();
    }

    @GetMapping("/findAll")
    List<Departamentos> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Departamentos[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Departamentos> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Departamentos[].class));
    }

    @GetMapping("/findById/{id}")
    Departamentos findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Departamentos.class);
    }

    @GetMapping("/pais/{idPais}")
    List<Departamentos> findByPais(@PathVariable Integer idPais){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/pais/" + idPais,Departamentos[].class));
    }

    @PostMapping()
    Departamentos save(@RequestBody Departamentos departamentos){
        return restTemplate.postForObject(DOMAIN_URL ,departamentos,Departamentos.class);
    }

    @PutMapping()
    Departamentos update(@RequestBody Departamentos departamentos){
        return restTemplate.postForObject(DOMAIN_URL ,departamentos,Departamentos.class);
    }
}
