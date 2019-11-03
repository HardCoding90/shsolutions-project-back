package com.shsolutions.project.dominio.controladores;

import com.shsolutions.project.dominio.configuracion.SecurityConfig;
import com.shsolutions.project.dominio.configuracion.SeguridadAcceso;
import com.shsolutions.project.dominio.modelos.Usuarios;
import com.shsolutions.project.dominio.repositorios.PersonasRepository;
import com.shsolutions.project.dominio.repositorios.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.shsolutions.project.dominio.configuracion.SecurityConfig.validarAcceso;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private PersonasRepository personasRepository;

    @GetMapping("/findAll")
    List<Usuarios> findAll() {
        return usuariosRepository.findAll();
    }

    @GetMapping("/findAll/enabled")
    List<Usuarios> findAllEnabled() {
        return usuariosRepository.findAllByIndicadorHabilitadoTrue();
    }

    @GetMapping("/findById/{id}")
    Usuarios findById(@PathVariable Integer id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @PostMapping()
    Usuarios save(@RequestBody Usuarios usuarios) {
        SeguridadAcceso.accesoUsuario(usuarios,personasRepository.findById(usuarios.getIdPersona()).orElse(null));
        return usuariosRepository.save(usuarios);
    }

    @PostMapping("/autorizarIngreso")
    Boolean findEnabled(@RequestBody Usuarios usuarios) {
        Usuarios usuarioBd = findById(usuarios.getIdUsuario());
        return validarAcceso(usuarios,usuarioBd);
    }
}
