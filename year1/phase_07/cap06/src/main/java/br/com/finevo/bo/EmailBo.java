package br.com.finevo.bo;

import br.com.finevo.exception.EmailException;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailBo {

    private static final String EMAIL_FROM = "dasilvaaleatorio92@gmail.com";
    private static final String APP_PASSWORD = "iwmo uvff zqmv iyyy";

    public void sendEmail(
            String recipient,
            String subject,
            String msg) throws EmailException {

        // Dados de configuração do email
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        // Autenticação na conta de email do remetente
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_FROM, APP_PASSWORD);
            }
        });

        // Enviar a mensagem
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EMAIL_FROM));
            message.setRecipients(
                    Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(msg);
            Transport.send(message);
        } catch (MessagingException e) {
            throw new EmailException("Error sending email: " + e.getMessage());
        }

    }

}
