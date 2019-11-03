package com.shsolutions.project.dominio.configuracion;

import com.shsolutions.project.dominio.modelos.Personas;
import com.shsolutions.project.dominio.modelos.Usuarios;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EnviarCorreo {

    public static void enviarCorreo(Usuarios usuarios, Personas personas) {
        final String username = "warevalo.electronica2017@gmail.com";
        final String password = "21seminarista21";

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
                    InternetAddress.parse("")
            );
            message.setSubject("Código de seguridad");
            message.setText("Dear Mail Crawler,"
                    + "\n\n Please do not spam my email!");

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private void generarCodigoSeguridad(){

    }
}
