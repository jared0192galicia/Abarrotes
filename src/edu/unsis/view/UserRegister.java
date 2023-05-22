/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 22/may/2023
 * Descripcion: Registra Usuarios
 */
package edu.unsis.view;

import edu.unsis.model.Data;
import model.entity.User;

/**
 *
 * @author labtecweb10
 */
public class UserRegister extends javax.swing.JFrame {

    private Data data = MainMenu.data;

    public UserRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        comboSex = new javax.swing.JComboBox<>();
        comboEdo = new javax.swing.JComboBox<>();
        comboLevel = new javax.swing.JComboBox<>();
        buttonRegister = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserName.setBackground(new java.awt.Color(102, 153, 255));
        txtUserName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 210, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de usuarios");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña provisional");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        txtEmail.setBackground(new java.awt.Color(102, 153, 255));
        txtEmail.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 210, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtEdad.setBackground(new java.awt.Color(102, 153, 255));
        txtEdad.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 210, 30));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edad");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtName.setBackground(new java.awt.Color(102, 153, 255));
        txtName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 210, 30));

        comboSex.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        comboSex.setForeground(new java.awt.Color(255, 255, 255));
        comboSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     Sexo", "      M", "      F" }));
        comboSex.setToolTipText("Nivel de permisos");
        panel1.add(comboSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 150, -1));

        comboEdo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        comboEdo.setForeground(new java.awt.Color(255, 255, 255));
        comboEdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "      Estado", "      Activo", "     Inactivo" }));
        comboEdo.setToolTipText("Nivel de permisos");
        panel1.add(comboEdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 180, -1));

        comboLevel.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        comboLevel.setForeground(new java.awt.Color(255, 255, 255));
        comboLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   Nivel", "     1", "     2", "     3" }));
        comboLevel.setToolTipText("Nivel de permisos");
        panel1.add(comboLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 120, -1));

        buttonRegister.setBackground(new java.awt.Color(102, 153, 255));
        buttonRegister.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setText("Registrar");
        buttonRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });
        panel1.add(buttonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 210, 35));

        txtPass.setBackground(new java.awt.Color(102, 153, 255));
        txtPass.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 210, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Usuario");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Compiler data and send to data
    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        String name = txtName.getText().trim();
        String user = txtUserName.getText().trim();
        String pass = txtPass.getText().trim();
        String mail = txtEmail.getText().trim();
        String edad = txtEdad.getText().trim();

        String level = comboLevel.getSelectedItem().toString();
        String sexo = comboSex.getSelectedItem().toString();
        String status = comboEdo.getSelectedItem().toString();

        User u = new User(user, pass, mail,
                Integer.parseInt(level), true, name,
                Integer.parseInt(edad), sexo.charAt(0));

        data.createUser(u);
    }//GEN-LAST:event_buttonRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegister;
    private javax.swing.JComboBox<String> comboEdo;
    private javax.swing.JComboBox<String> comboLevel;
    private javax.swing.JComboBox<String> comboSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
