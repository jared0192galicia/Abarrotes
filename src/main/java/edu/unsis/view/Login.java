/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 11 / Jul / 2023
 * Descripcion: Login principal
 */
package edu.unsis.view;

import edu.unsis.controller.LoginController;
import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public final class Login extends javax.swing.JFrame {

    private int posX;
    private int posY;

    private final ImageIcon iconClose;
    private final ImageIcon iconCloseN;
    private final ImageIcon iconMin;
    private final ImageIcon iconMinN;
    private final LoginController controller;
    private Clip clip;

    public static int levelUser;

    /**
     * Contructor for Frame Login. Set Wallpaper and more images
     */
    public Login() {
        initComponents();

        this.buttonAcceder.requestFocus(true);
        this.setSize(650, 430);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        controller = new LoginController();

        ImageIcon image = new ImageIcon("./src/main/java/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/mainLogo.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(logoStore.getWidth(),
                logoStore.getHeight(), Image.SCALE_DEFAULT));

        logoStore.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/minimizeUno.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonMin.getWidth(),
                buttonMin.getHeight(), Image.SCALE_DEFAULT));

        iconMinN = icon;
        buttonMin.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/closeUno.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonClose.getWidth(),
                buttonClose.getHeight(), Image.SCALE_DEFAULT));

        iconCloseN = icon;
        buttonClose.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/closeDos.png");
        iconClose = new ImageIcon(image.getImage().getScaledInstance(buttonClose.getWidth(),
                buttonClose.getHeight(), Image.SCALE_DEFAULT));

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/minimizeDos.png");
        iconMin = new ImageIcon(image.getImage().getScaledInstance(buttonClose.getWidth(),
                buttonClose.getHeight(), Image.SCALE_DEFAULT));
        this.playSountrack("soundLogin");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLeft = new javax.swing.JPanel();
        logoStore = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();
        panelRigth = new javax.swing.JPanel();
        buttonMin = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        buttonAcceder = new javax.swing.JButton();
        labelPassword = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelLeft.add(logoStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 230, 220));
        panelLeft.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 430));

        getContentPane().add(panelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 325, 430));

        panelRigth.setBackground(new java.awt.Color(153, 153, 255));
        panelRigth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonMin.setBackground(new java.awt.Color(153, 153, 255));
        buttonMin.setForeground(new java.awt.Color(204, 0, 0));
        buttonMin.setBorder(null);
        buttonMin.setBorderPainted(false);
        buttonMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMin.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        panelRigth.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 0, 40, 40));

        buttonClose.setBackground(new java.awt.Color(153, 153, 255));
        buttonClose.setForeground(new java.awt.Color(204, 0, 0));
        buttonClose.setBorder(null);
        buttonClose.setBorderPainted(false);
        buttonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonClose.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCloseMouseExited(evt);
            }
        });
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        panelRigth.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 40, 40));

        txtPass.setBackground(new java.awt.Color(102, 153, 255));
        txtPass.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRigth.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 210, 30));
        txtPass.getAccessibleContext().setAccessibleName("");

        txtUser.setBackground(new java.awt.Color(102, 153, 255));
        txtUser.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelRigth.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 210, 30));
        txtUser.getAccessibleContext().setAccessibleName("");

        buttonAcceder.setBackground(new java.awt.Color(102, 153, 255));
        buttonAcceder.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        buttonAcceder.setForeground(new java.awt.Color(255, 255, 255));
        buttonAcceder.setMnemonic('A');
        buttonAcceder.setText("Acceder");
        buttonAcceder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAcceder.setFocusCycleRoot(true);
        buttonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAccederActionPerformed(evt);
            }
        });
        panelRigth.add(buttonAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 30));

        labelPassword.setForeground(new java.awt.Color(153, 0, 0));
        labelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPassword.setText("¿Olvidó su contraseña?");
        labelPassword.setToolTipText("Recupera tu contraseña de acceso");
        labelPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPasswordMouseExited(evt);
            }
        });
        panelRigth.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 260, -1, -1));

        labelTitle.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Login");
        panelRigth.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 70, -1, -1));

        getContentPane().add(panelRigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 0, 325, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit to program
     *
     * @param evt
     */
    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonCloseActionPerformed

    /**
     *
     * Play music of init
     *
     * @param sonido
     */
    public void playSountrack(String sonido) {

        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    new File("./src/main/java/edu/unsis/media/audio/" + sonido + ".wav"));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
        }
    }

    /**
     * change to cursor hand with hover event
     *
     * @param evt
     */
    private void labelPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPasswordMouseEntered
        this.setCursor(HAND_CURSOR);
    }//GEN-LAST:event_labelPasswordMouseEntered

    /**
     * change to cursor normal with hover exited event
     *
     * @param evt
     */
    private void labelPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPasswordMouseExited
        this.setCursor(NORMAL);
    }//GEN-LAST:event_labelPasswordMouseExited

    /**
     * check that all fields are filled with valid data. After call to
     * controller for valid acces
     *
     * @param evt
     */
    private void buttonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAccederActionPerformed
        String userTxt = txtUser.getText().trim();
        String pass = txtPass.getText().trim();
        boolean band = true;
        if (userTxt.equals("")) {
            band = false;
            txtUser.setBackground(Color.red);
        } else {
            txtUser.setBackground(new Color(102, 153, 255));
        }

        if (pass.equals("")) {
            band = false;
            txtPass.setBackground(Color.red);
        } else {
            txtPass.setBackground(new Color(102, 153, 255));
        }

        if (band) {
            User user = new User();

            if (controller.getMatch(new Credentials(pass, userTxt), user)) {

                if (user.isStatus()) {

                    int level = user.getLevel();
                    levelUser = level;

                    if (level == 1) {

                        new MainMenu().setVisible(true);
                        this.dispose();
                    } else {

                        new MainMenuSeller().setVisible(true);
                        this.dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Usuario Inactivo");
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Nombre de usuario o contraseña incorrectos");
            }
        }
    }//GEN-LAST:event_buttonAccederActionPerformed

    /**
     * Get updated position of the frame, and save point
     *
     * @param evt
     */
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    /**
     * Update position in screen
     *
     * @param evt
     */
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_formMouseDragged

    /**
     * Minimize window
     *
     * @param evt
     */
    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    /**
     * Change foreground of buttonMin. Event hover
     *
     * @param evt
     */
    private void buttonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseEntered
        this.buttonMin.setIcon(iconMin);
    }//GEN-LAST:event_buttonMinMouseEntered

    /**
     * Change foreground of buttonExit. Event hover
     *
     * @param evt
     */
    private void buttonCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseEntered
        this.buttonClose.setIcon(iconClose);
    }//GEN-LAST:event_buttonCloseMouseEntered

    /**
     * Change foreground of buttonExit. Event hover
     *
     * @param evt
     */
    private void buttonCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseExited
        this.buttonClose.setIcon(iconCloseN);
    }//GEN-LAST:event_buttonCloseMouseExited

    /**
     * Change foreground of buttonMin. Event hover
     *
     * @param evt
     */
    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setIcon(iconMinN);
    }//GEN-LAST:event_buttonMinMouseExited

    private void labelPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPasswordMouseClicked
        new RecoverAcces().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAcceder;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonMin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel logoStore;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelRigth;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

}
