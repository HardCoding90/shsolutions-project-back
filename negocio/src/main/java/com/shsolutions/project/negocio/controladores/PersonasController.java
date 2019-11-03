package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Personas;
import com.shsolutions.project.negocio.modelos.Usuarios;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.shsolutions.project.negocio.utilidades.Utilidades.DOMAIN;
import static com.shsolutions.project.negocio.utilidades.Utilidades.restTemplate;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/personas")
public class PersonasController {

    private final String DOMAIN_URL = DOMAIN + "personas";
    private final String DOMAIN_URL_USUARIOS = DOMAIN + "usuarios";

    @GetMapping("/cascaron")
    Personas cascaron() {
        return new Personas();
    }

    @GetMapping("/findAll")
    List<Personas> findAll(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll",Personas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Personas> findAllEnabled(){
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled",Personas[].class));
    }

    @GetMapping("/findById/{id}")
    Personas findOne(@PathVariable Integer id){
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id,Personas.class);
    }

    @PostMapping("/sucursalCreacion/{idSucursal}")
    Personas save(@RequestBody Personas personas,@PathVariable Integer idSucursal){
        personas = restTemplate.postForObject(DOMAIN_URL ,personas,Personas.class);
        if(personas != null && personas.getIndicadorCliente() != null && !personas.getIndicadorCliente()){
            crearUsuarioPersona(personas, idSucursal);
        }
        return personas;
    }

    @PutMapping()
    Personas update(@RequestBody Personas personas){
        return restTemplate.postForObject(DOMAIN_URL ,personas,Personas.class);
    }

    private void crearUsuarioPersona(Personas personas, Integer idSucursal){
        Usuarios usuarios = new Usuarios();
        usuarios.setUsuario(personas.getNumeroDocumento());
        usuarios.setIdSucursal(idSucursal);
        restTemplate.postForObject(DOMAIN_URL_USUARIOS, usuarios, Usuarios.class);
    }

}
