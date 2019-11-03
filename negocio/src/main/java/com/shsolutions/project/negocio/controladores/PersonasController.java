package com.shsolutions.project.negocio.controladores;

import com.shsolutions.project.negocio.modelos.Personas;
import com.shsolutions.project.negocio.modelos.Usuarios;
import com.shsolutions.project.negocio.modelos.UsuariosRoles;
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
    private final String DOMAIN_URL_USUARIOS_ROLES = DOMAIN + "usuariosRoles";

    @GetMapping("/cascaron")
    Personas cascaron() {
        return new Personas();
    }

    @GetMapping("/findAll")
    List<Personas> findAll() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll", Personas[].class));
    }

    @GetMapping("/findAll/enabled")
    List<Personas> findAllEnabled() {
        return Arrays.asList(restTemplate.getForObject(DOMAIN_URL + "/findAll/enabled", Personas[].class));
    }

    @GetMapping("/findById/{id}")
    Personas findOne(@PathVariable Integer id) {
        return restTemplate.getForObject(DOMAIN_URL + "/findById/" + id, Personas.class);
    }

    @PostMapping()
    Personas save(@RequestBody Personas personas) {
        Personas persona = restTemplate.postForObject(DOMAIN_URL, personas, Personas.class);
        if (personas != null && personas.getIndicadorCliente() != null && !personas.getIndicadorCliente()) {
            persona.setIdRol(personas.getIdRol());
            persona.setIdSucursal(personas.getIdSucursal());
            agregarRolAlUsuario(crearUsuarioPersona(persona), persona.getIdRol());
        }
        return persona;
    }

    @PutMapping()
    Personas update(@RequestBody Personas personas) {
        return restTemplate.postForObject(DOMAIN_URL, personas, Personas.class);
    }

    private Usuarios crearUsuarioPersona(Personas personas) {
        Usuarios usuarios = new Usuarios();
        usuarios.setUsuario(personas.getNumeroDocumento());
        usuarios.setIdSucursal(personas.getIdSucursal());
        usuarios.setIdPersona(personas.getIdPersona());
        return restTemplate.postForObject(DOMAIN_URL_USUARIOS, usuarios, Usuarios.class);
    }

    private UsuariosRoles agregarRolAlUsuario(Usuarios usuario, Integer idRol) {
        UsuariosRoles usuariosRoles = new UsuariosRoles();
        usuariosRoles.setIdUsuario(usuario.getIdUsuario());
        usuariosRoles.setIdRol(idRol);
        return restTemplate.postForObject(DOMAIN_URL_USUARIOS_ROLES, usuariosRoles, UsuariosRoles.class);
    }

}
