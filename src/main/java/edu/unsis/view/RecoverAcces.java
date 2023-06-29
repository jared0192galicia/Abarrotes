/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 13 / Jun / 2023
 * modificado 13 / Jun / 2023
 * Descripcion: Controlador para ventana de recuperación de contrsaeña
 */
package edu.unsis.view;

import edu.unsis.controller.RecoverAccesController;
import edu.unsis.utilities.MatchForMail;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RecoverAcces extends javax.swing.JFrame {

    private final RecoverAccesController controller;

    /**
     * Creates new form RecoverAcces
     */
    public RecoverAcces() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        ImageIcon image = new ImageIcon(
                "./src/main/java/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(
                wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(icon);        
        wallpaper1.setIcon(icon);


        this.labelTime.setVisible(false);
        this.buttonAcep.setVisible(false);
        this.panelForPassword.setVisible(false);

        controller = new RecoverAccesController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        buttonMin = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        labelTime = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        labelInfoMail = new javax.swing.JLabel();
        buttonSendCode = new javax.swing.JButton();
        buttonAcep = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();
        panelForPassword = new javax.swing.JPanel();
        txtPass = new javax.swing.JTextField();
        txtConfirmPass = new javax.swing.JPasswordField();
        labelPassRepeat = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        labelSubTitle = new javax.swing.JLabel();
        buttonChangePass = new javax.swing.JButton();
        wallpaper1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelMain.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 40));

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
        panelMain.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 40, 40));

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
        panelMain.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 160, 210, 30));

        labelTitle.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Recuperar contraseña");
        panelMain.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtCode.setEditable(false);
        txtCode.setBackground(new java.awt.Color(102, 153, 255));
        txtCode.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtCode.setForeground(new java.awt.Color(204, 204, 204));
        txtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCode.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtCode.setSelectionColor(new java.awt.Color(0, 102, 102));
        panelMain.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 280, 210, 30));

        labelTime.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 255, 255));
        labelTime.setText("Código valido durante 60 Seg");
        panelMain.add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        labelInfo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelInfo.setText("Código de recuperación");
        panelMain.add(labelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        labelInfoMail.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelInfoMail.setForeground(new java.awt.Color(255, 255, 255));
        labelInfoMail.setText("Correo electrónico");
        panelMain.add(labelInfoMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        buttonSendCode.setBackground(new java.awt.Color(0, 102, 102));
        buttonSendCode.setForeground(new java.awt.Color(255, 255, 255));
        buttonSendCode.setText("ENVIAR CÓDIGO");
        buttonSendCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSendCodeActionPerformed(evt);
            }
        });
        panelMain.add(buttonSendCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 160, 40));

        buttonAcep.setBackground(new java.awt.Color(0, 102, 102));
        buttonAcep.setForeground(new java.awt.Color(255, 255, 255));
        buttonAcep.setText("ACEPTAR");
        buttonAcep.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcepActionPerformed(evt);
            }
        });
        panelMain.add(buttonAcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 160, 40));
        panelMain.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 450));

        panelForPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass.setBackground(new java.awt.Color(102, 153, 255));
        txtPass.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelForPassword.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        txtConfirmPass.setBackground(new java.awt.Color(102, 153, 255));
        txtConfirmPass.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtConfirmPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelForPassword.add(txtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 210, 30));

        labelPassRepeat.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelPassRepeat.setForeground(new java.awt.Color(255, 255, 255));
        labelPassRepeat.setText("Repita su contraseña");
        panelForPassword.add(labelPassRepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        labelPass.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelPass.setForeground(new java.awt.Color(255, 255, 255));
        labelPass.setText("Nueva Contraseña");
        panelForPassword.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        labelSubTitle.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        labelSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelSubTitle.setText("CAMBIO DE CONTRASEÑA");
        panelForPassword.add(labelSubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        buttonChangePass.setBackground(new java.awt.Color(0, 102, 102));
        buttonChangePass.setForeground(new java.awt.Color(255, 255, 255));
        buttonChangePass.setText("Aceptar");
        buttonChangePass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangePassActionPerformed(evt);
            }
        });
        panelForPassword.add(buttonChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 160, 40));
        panelForPassword.add(wallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelForPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelForPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Decorated button exited in event hover
     *
     * @param evt
     */
    private void buttonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseEntered
        this.buttonMin.setForeground(Color.red);
    }//GEN-LAST:event_buttonMinMouseEntered

    /**
     * Decorated button exited in event hover
     *
     * @param evt
     */
    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setForeground(Color.white);
    }//GEN-LAST:event_buttonMinMouseExited

    /**
     * Minimize this frame
     * @param evt 
     */
    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    /**
     * Decorated button exited in event hover
     *
     * @param evt
     */
    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered
        this.buttonExit.setForeground(Color.red);
    }//GEN-LAST:event_buttonExitMouseEntered

    /**
     * Decorated button exited in event hover
     *
     * @param evt
     */
    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited
        this.buttonExit.setForeground(Color.white);
    }//GEN-LAST:event_buttonExitMouseExited

    /**
     * Exited of the program
     *
     * @param evt
     */
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    /**
     * This method not funtion. ~ Netbeands no permite borrarlo
     * @param evt 
     */
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        
    }//GEN-LAST:event_txtEmailActionPerformed

    /**
     * Compare if exist mail in data base and send a code to mail else 
     * show a message dialog
     * 
     * @param evt 
     */
    private void buttonSendCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSendCodeActionPerformed
        String mail = this.txtEmail.getText().trim();

        if (controller.existEmail(mail)) {
            String code = MatchForMail.generateCode();
            String ast = "Código de recuperación";
            String msg = "Este es su código de recuperación para contraseña."
                    + "\n No comparta este código con nadie " + code
                    + "\n Valido durante 1 minuto";

            controller.enviarConGMail(mail, ast, msg);

            this.txtEmail.setEditable(false);
            this.txtEmail.setBackground(Color.GREEN);
            this.txtCode.setEditable(true);
            this.txtCode.requestFocus(true);
            this.buttonAcep.setVisible(true);
            controller.startTime(labelTime);
            labelTime.setVisible(true);
            
            this.buttonSendCode.setLocation(270, 370);
            this.buttonSendCode.setText("Reenviar");

        } else {
            JOptionPane.showMessageDialog(null,
                    "El correo electroonico no oertenece a ningun usuario");
        }
    }//GEN-LAST:event_buttonSendCodeActionPerformed

    /**
     * Compare if the code joined with code generate
     * @param evt 
     */
    private void buttonAcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcepActionPerformed
        String code = txtCode.getText().trim();

        if (MatchForMail.compareTo(code)) {
            controller.stopTime();
            this.txtPass.setVisible(true);
            this.panelMain.setVisible(false);
            this.panelForPassword.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Codigo Erroneo");
        }
    }//GEN-LAST:event_buttonAcepActionPerformed

    
    /**
     * Delete text for default
     * @param evt 
     */
    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        if (txtEmail.getText().trim().equals("Ingrese su correo")) {
            this.txtEmail.setText("");
            this.txtEmail.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtEmailMouseClicked

    /**
     * Change password for the joined
     * @param evt 
     */
    private void buttonChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangePassActionPerformed
        String pass = txtPass.getText().trim();
        String confirmPass = txtConfirmPass.getText().trim();
        
        if (pass.equals(confirmPass)) {
            controller.updatePassword(this.txtEmail.getText().trim(), pass);
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonChangePassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new RecoverAcces().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAcep;
    private javax.swing.JButton buttonChangePass;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonSendCode;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelInfoMail;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPassRepeat;
    private javax.swing.JLabel labelSubTitle;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelForPassword;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txtCode;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPass;
    private javax.swing.JLabel wallpaper;
    private javax.swing.JLabel wallpaper1;
    // End of variables declaration//GEN-END:variables
}
