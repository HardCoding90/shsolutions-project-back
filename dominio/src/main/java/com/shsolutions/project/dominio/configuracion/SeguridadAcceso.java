package com.shsolutions.project.dominio.configuracion;

import com.shsolutions.project.dominio.modelos.Personas;
import com.shsolutions.project.dominio.modelos.Usuarios;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

import static com.shsolutions.project.dominio.configuracion.SecurityConfig.codificarContrasenia;

public class SeguridadAcceso {

    public static void accesoUsuario(Usuarios usuarios, Personas personas) {
        if (usuarios.getIdUsuario() == null) {
            usuarios.setIndicadorNuevo(true);
            enviarCorreoSeguridad(usuarios, personas);
        } else {
            usuarios.setIndicadorNuevo(false);
            codificarContrasenia(usuarios);
        }
    }

    public static void enviarCorreoSeguridad(Usuarios usuarios, Personas personas) {
        if (personas == null) return;
        final String username = "XXXXXX";
        final String password = "XXXXXX";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("SHSolutions"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(personas.getEmail())
            );
            message.setSubject("Código de seguridad");
            message.setText("SHSolutions le da la bienvenida."
                    + "\n\nPara continuar con el proceso de seguridad actualize su usuario y contraseña.\n\nSu usuario es su número de documento y esta es su contraseña temporal: " + generarCodigoSeguridad(usuarios) + "\n\n"
                    + "Por favor ingrese y actualize sus datos.\n\nMuchas gracias.");

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private static Integer generarCodigoSeguridad(Usuarios usuarios) {
        Random random = new Random();
        Integer numeroValidacion = random.nextInt(999999);
        usuarios.setContrasenia(numeroValidacion.toString());
        codificarContrasenia(usuarios);
        return numeroValidacion;
    }


}
