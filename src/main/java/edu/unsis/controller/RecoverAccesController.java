/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 13 / Jun / 2023
 * modificado 13 / Jun / 2023
 * Descripcion: Controlador para ventana de recuperación de contrsaeña
 */
package edu.unsis.controller;

import edu.unsis.model.IUserModel;
import edu.unsis.model.UserModelImpl;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RecoverAccesController {

    private final IUserModel model = new UserModelImpl();
    private final ThreadTimer timer = new ThreadTimer();

    /**
     * Call model for compare mail
     * @param email
     * @return 
     */
    public boolean existEmail(String email) {
        return model.search(email);
    }

    /**
     * Start time for valid code
     * @param labelTime 
     */
    public void startTime(JLabel labelTime) {
        timer.setShowTimer(labelTime);
        if (timer.isAlive()) {
            this.stopTime();
        }
        timer.start();
    }
    
    /**
     * Stop thread
     */
    public void stopTime() {
        timer.stop();
    }

    /**
     * call to model for update password
     * @param mail
     * @param pass 
     */
    public void updatePassword(String mail, String pass) {
        model.update(mail, pass);
    }
    
    /**
     * Send mail to user with data from params
     * @param destinatario Mail of the user
     * @param asunto Asunto in mail
     * @param cuerpo Message to send
     */
    public void enviarConGMail(String destinatario, String asunto, String cuerpo) {
        //La dirección de correo de envío
        String remitente = "jared0192galicia@gmail.com";
        //La clave de aplicación obtenida según se explica en este artículo:
        String claveemail = "xpxhduwujqsikjaf";

        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", claveemail);    //La clave de la cuenta
        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
        props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(remitente));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));   //Se podrían añadir varios de la misma manera
            message.setSubject(asunto);
            message.setText(cuerpo);
            try (Transport transport = session.getTransport("smtp")) {
                transport.connect("smtp.gmail.com", remitente, claveemail);
                transport.sendMessage(message, message.getAllRecipients());
            }
        } catch (MessagingException me) {
            JOptionPane.showMessageDialog(null, "Error al enviar correo", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
