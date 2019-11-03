package com.shsolutions.project.dominio.configuracion;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.shsolutions.project.dominio.modelos.Usuarios;

public class SecurityConfig {

    public static String encriptarContrasenia(String password) {
        return JWT.create()
                .withIssuer(password)
                .sign(Algorithm.HMAC256("secret"));
    }

    public static Boolean validarAcceso(Usuarios usuario, Usuarios usuarioBd) {
        return usuarioBd.getContrasenia().equals(encriptarContrasenia(usuario.getContrasenia())) && usuario.getUsuario().equals(usuarioBd.getUsuario());
    }

    public static void codificarContrasenia(Usuarios usuarios) {
        usuarios.setContrasenia(SecurityConfig.encriptarContrasenia(usuarios.getContrasenia()));
    }
}