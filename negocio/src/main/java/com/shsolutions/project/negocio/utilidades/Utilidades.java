package com.shsolutions.project.negocio.utilidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Utilidades {

    public static String DOMAIN = "http://localhost:8082/api/";

    public static RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        Utilidades.restTemplate = restTemplate;
    }

}
