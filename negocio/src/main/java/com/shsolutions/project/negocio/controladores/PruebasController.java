package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Pruebas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/pruebas")
public class PruebasController {

    @Value("${spring.application.name}")
    String appName;

    @Autowired
    RestTemplate restTemplate;

    private String DOMAIN = "http://localhost:8082/api/pruebas";

    @GetMapping("/findAll")
    List<Pruebas> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN + "/findAll",Pruebas[].class));
    }

    /*@RequestMapping(path = "/welcome")
    @ResponseBody
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }*/

    @PostMapping()
    Pruebas save(@RequestBody Pruebas prueba){
        return restTemplate.postForObject(DOMAIN ,prueba,Pruebas.class);
    }

}
