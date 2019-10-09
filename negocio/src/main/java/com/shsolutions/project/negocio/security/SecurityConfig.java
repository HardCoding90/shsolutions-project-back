package com.shsolutions.project.negocio.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.shsolutions.project.negocio.modelos.Usuarios;

public class SecurityConfig {

    public static String passwordEncode(String password){
        return JWT.create()
                .withIssuer(password)
                .sign(Algorithm.HMAC256("secret"));
    }

    public static Boolean authVerification(Usuarios usuario, String verificarUsuario){
        return verificarUsuario.equals(passwordEncode(usuario.getContrasenia()));
    }

    public static void codificarContrasenia(Usuarios usuarios){
        usuarios.setContrasenia(SecurityConfig.passwordEncode(usuarios.getContrasenia()));
    }
}