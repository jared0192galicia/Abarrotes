/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 11 / Jun / 2023
 * Descripcion: Registra Usuarios
 */
package edu.unsis.view;

import edu.unsis.controller.UsersController;
import edu.unsis.model.UserModelImpl;
import edu.unsis.model.entity.User;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UpdateUserSeller extends javax.swing.JFrame {

    private final User userLogger = UserModelImpl.getLoggedUser();
    private UsersController controller;

    /**
     * Creates new form UpdateUserSeller
     */
    public UpdateUserSeller() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        ImageIcon image = new ImageIcon("./src/main/java/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        this.wallpaper.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/home.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonHome.getWidth(),
                buttonHome.getHeight(), Image.SCALE_DEFAULT));

        buttonHome.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        labelEdad = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        comboSex = new javax.swing.JComboBox<>();
        comboEdo = new javax.swing.JComboBox<>();
        comboLevel = new javax.swing.JComboBox<>();
        txtPass = new javax.swing.JPasswordField();
        labelUser = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        buttonMin = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserName.setBackground(new java.awt.Color(102, 153, 255));
        txtUserName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 210, 30));

        labelTitle.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Registro de usuarios");
        panel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        labelPass.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelPass.setForeground(new java.awt.Color(255, 255, 255));
        labelPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPass.setText("Contraseña provisional");
        panel1.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        txtEmail.setBackground(new java.awt.Color(102, 153, 255));
        txtEmail.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 210, 30));

        labelEmail.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail.setText("Email");
        panel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtEdad.setBackground(new java.awt.Color(102, 153, 255));
        txtEdad.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 210, 30));

        labelEdad.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelEdad.setForeground(new java.awt.Color(255, 255, 255));
        labelEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEdad.setText("Edad");
        panel1.add(labelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        labelName.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelName.setText("Nombre");
        panel1.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtName.setBackground(new java.awt.Color(102, 153, 255));
        txtName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, 30));

        comboSex.setBackground(new java.awt.Color(102, 153, 255));
        comboSex.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        comboSex.setForeground(new java.awt.Color(255, 255, 255));
        comboSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         Sexo", "           M", "           F" }));
        comboSex.setToolTipText("Nivel de permisos");
        comboSex.setEnabled(false);
        panel1.add(comboSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, -1));

        comboEdo.setBackground(new java.awt.Color(102, 153, 255));
        comboEdo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        comboEdo.setForeground(new java.awt.Color(255, 255, 255));
        comboEdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        Estado", "        Activo", "       Inactivo" }));
        comboEdo.setToolTipText("Nivel de permisos");
        comboEdo.setEnabled(false);
        panel1.add(comboEdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 210, -1));

        comboLevel.setBackground(new java.awt.Color(102, 153, 255));
        comboLevel.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        comboLevel.setForeground(new java.awt.Color(255, 255, 255));
        comboLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        Nivel", "          1", "          2", "          3" }));
        comboLevel.setToolTipText("Nivel de permisos");
        comboLevel.setEnabled(false);
        panel1.add(comboLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 210, -1));

        txtPass.setBackground(new java.awt.Color(102, 153, 255));
        txtPass.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 210, -1));

        labelUser.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUser.setText("Usuario");
        panel1.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        buttonExit.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 255, 255));
        buttonExit.setText("x");
        buttonExit.setBorder(null);
        buttonExit.setContentAreaFilled(false);
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        panel1.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 40));

        buttonMin.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        buttonMin.setForeground(new java.awt.Color(255, 255, 255));
        buttonMin.setText("-");
        buttonMin.setBorder(null);
        buttonMin.setContentAreaFilled(false);
        buttonMin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        panel1.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 40, 40));

        buttonUpdate.setBackground(new java.awt.Color(102, 153, 255));
        buttonUpdate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        buttonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        buttonUpdate.setText("Actualizar");
        buttonUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });
        panel1.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 210, 35));

        buttonHome.setBorder(null);
        buttonHome.setBorderPainted(false);
        buttonHome.setContentAreaFilled(false);
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonHome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        panel1.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 60));
        panel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
     * Exited the program
     * @param evt 
     */
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

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
     * Minimmize this frame
     * @param evt 
     */
    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    /**
     * Acualiza el usuario
     * @param evt 
     */
    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed

        String aux = userLogger.getEmail();

        if (aux != null) {

            // Get strings
            String name = txtName.getText().trim();
            String user = txtUserName.getText().trim();
            String pass = txtPass.getText().trim();
            String mail = txtEmail.getText().trim();
            String edad = txtEdad.getText().trim();

            String level = comboLevel.getSelectedItem().toString().trim();
            String sexo = comboSex.getSelectedItem().toString().trim();
            String status = comboEdo.getSelectedItem().toString().trim();

            boolean band = true;
            
             // Valid camps nulls
             
            if (name.equals("")) {
                txtName.setBackground(Color.red);
                band = false;
            } else {
                txtName.setBackground(new Color(102, 153, 255));
            }

            if (user.equals("")) {
                txtUserName.setBackground(Color.red);
                band = false;
            } else {
                txtUserName.setBackground(new Color(102, 153, 255));
            }

            if (pass.equals("")) {
                txtPass.setBackground(Color.red);
                band = false;
            } else {
                txtPass.setBackground(new Color(102, 153, 255));
            }

            if (mail.equals("")) {
                txtEmail.setBackground(Color.red);
                band = false;
            } else {
                txtEmail.setBackground(new Color(102, 153, 255));
            }

            if (edad.equals("")) {
                txtEdad.setBackground(Color.red);
                band = false;
            } else {
                txtEdad.setBackground(new Color(102, 153, 255));
            }

            if (level.equals("Nivel")) {
                comboLevel.setBackground(Color.red);
                band = false;
            } else {
                comboLevel.setBackground(new Color(102, 153, 255));
            }

            if (sexo.equalsIgnoreCase("Sexo")) {
                comboSex.setBackground(Color.red);
                band = false;
            } else {
                comboSex.setBackground(new Color(102, 153, 255));
            }

            if (status.equals("Estado")) {
                comboEdo.setBackground(Color.red);
                band = false;
            } else {
                comboEdo.setBackground(new Color(102, 153, 255));
            }

            try {
                Integer.valueOf(edad);
            } catch (NumberFormatException e) {
                band = false;
                JOptionPane.showMessageDialog(null,
                        "No puede ingresar caracteres en algunos campos");
            }
            // Continue if all data is correct
            if (band) {
                User u = new User(user, pass, mail,
                        Integer.parseInt(level), true, name,
                        Integer.parseInt(edad), sexo.charAt(0));

                if (userLogger.compareTo(u)) {
                    JOptionPane.showMessageDialog(null,
                            "No se modifico ningun campo", "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    // Update user, and show message of status
                    if (controller.update(u)) {
                        JOptionPane.showMessageDialog(null,
                                "Usuario actualizado", "Info",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "No se pudo actualizar", "Info",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    /**
     * regresa al home
     * @param evt 
     */
    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        if (Login.levelUser == 1) {
            new MainMenu().setVisible(true);
            this.dispose();
        } else {
            new MainMenuSeller().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateUserSeller().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> comboEdo;
    private javax.swing.JComboBox<String> comboLevel;
    private javax.swing.JComboBox<String> comboSex;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
