/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 13 / Jun / 2023
 * modificado 13 / Jun / 2023
 * Descripcion: Controlador para ventana de recuperación de contrsaeña
 */
package edu.unsis.view;

import edu.unsis.controller.RecoverAccesController;
import java.awt.Color;
import java.awt.Frame;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class RecoverAcces extends javax.swing.JFrame {

    private RecoverAccesController controller;

    /**
     * Creates new form RecoverAcces
     */
    public RecoverAcces() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.labelTime.setVisible(false);
//        this.buttonAcep.setVisible(false);
        this.buttonReSendCode.setVisible(false);

        controller = new RecoverAccesController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonMin = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        labelTime = new javax.swing.JLabel();
        buttonReSendCode = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonSendCode = new javax.swing.JButton();
        buttonAcep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonMin.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonMin.setForeground(new java.awt.Color(255, 255, 255));
        buttonMin.setText("-");
        buttonMin.setBorder(null);
        buttonMin.setContentAreaFilled(false);
        buttonMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMinMouseExited(evt);
            }
        });
        buttonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinActionPerformed(evt);
            }
        });
        jPanel1.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 40));

        buttonExit.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 255, 255));
        buttonExit.setText("x");
        buttonExit.setBorder(null);
        buttonExit.setContentAreaFilled(false);
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonExitMouseExited(evt);
            }
        });
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 40, 40));

        txtEmail.setBackground(new java.awt.Color(102, 153, 255));
        txtEmail.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setText("Ingrese su correo");
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmail.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtEmail.setSelectionColor(new java.awt.Color(0, 102, 102));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 160, 210, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recuperar contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 153, 255));
        jTextField2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jTextField2.setSelectionColor(new java.awt.Color(0, 102, 102));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 280, 210, 30));

        labelTime.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 255, 255));
        labelTime.setText("Código valido durante 60 Seg");
        jPanel1.add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        buttonReSendCode.setBackground(new java.awt.Color(0, 102, 102));
        buttonReSendCode.setForeground(new java.awt.Color(255, 255, 255));
        buttonReSendCode.setText("REENVIAR CÓDIGO");
        buttonReSendCode.setEnabled(false);
        buttonReSendCode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonReSendCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReSendCodeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonReSendCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 160, 40));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código de recuperación");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo electrónico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        buttonSendCode.setBackground(new java.awt.Color(0, 102, 102));
        buttonSendCode.setForeground(new java.awt.Color(255, 255, 255));
        buttonSendCode.setText("ENVIAR CÓDIGO");
        buttonSendCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendCodeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSendCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 160, 40));

        buttonAcep.setBackground(new java.awt.Color(0, 102, 102));
        buttonAcep.setForeground(new java.awt.Color(255, 255, 255));
        buttonAcep.setText("ACEPTAR");
        buttonAcep.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcepActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseEntered
        this.buttonMin.setForeground(Color.red);
    }//GEN-LAST:event_buttonMinMouseEntered

    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setForeground(Color.white);
    }//GEN-LAST:event_buttonMinMouseExited

    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered
        this.buttonExit.setForeground(Color.red);
    }//GEN-LAST:event_buttonExitMouseEntered

    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited
        this.buttonExit.setForeground(Color.white);
    }//GEN-LAST:event_buttonExitMouseExited

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonReSendCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReSendCodeActionPerformed

    }//GEN-LAST:event_buttonReSendCodeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void buttonSendCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendCodeActionPerformed
        String mail = this.txtEmail.getText().trim();

        if (controller.existEmail(mail)) {
            JOptionPane.showMessageDialog(null, "Encontrado");
        } else {
            JOptionPane.showMessageDialog(null, 
                    "El correo electroonico no oertenece a ningun usuario");
        }
    }//GEN-LAST:event_buttonSendCodeActionPerformed

    private void buttonAcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcepActionPerformed
        enviarConGMail("jared1029galicia@gmail.com", "test", 
                "Esta es una prueba");
    }//GEN-LAST:event_buttonAcepActionPerformed

    private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
    //La dirección de correo de envío
    String remitente = "jared1029galicia@gmail.com";
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
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", remitente, claveemail);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException me) {
        System.err.println("me = " + me);
        me.printStackTrace();   //Si se produce un error
    }
  }
    
    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        if (txtEmail.getText().trim().equals("Ingrese su correo")) {
            this.txtEmail.setText("");
            this.txtEmail.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtEmailMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecoverAcces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverAcces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverAcces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverAcces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverAcces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAcep;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonReSendCode;
    private javax.swing.JButton buttonSendCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelTime;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
