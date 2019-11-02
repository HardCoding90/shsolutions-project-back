package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Ivas;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ivas")
public class IvasController {

    private final String DOMAIN_URL = DOMAIN + "ivas";

    @GetMapping("/cascaron")
    Ivas cascaron() {
        return new Ivas();
    }

    @GetMapping("/findAll")
    List<Ivas> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Ivas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Ivas> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Ivas[].class));
    }

    @GetMapping("/findById/{id}")
    Ivas findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Ivas.class);
    }

    @PostMapping()
    Ivas save(@RequestBody Ivas ivas){
        return restTemplate.postForObject(DOMAIN_URL ,ivas,Ivas.class);
    }

    @PutMapping()
    Ivas update(@RequestBody Ivas ivas){
        return restTemplate.postForObject(DOMAIN_URL ,ivas,Ivas.class);
    }
}
