/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 22/may/2023
 * Descripcion: Login principal
 */
package edu.unsis.view;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author elietzer
 */
public class Login extends javax.swing.JFrame {

    private int posX;
    private int posY;
    
    private ImageIcon iconClose, iconCloseN;
    private ImageIcon iconMin, iconMinN;
    
    public Login() {
        initComponents();
        this.setSize(650, 430);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        ImageIcon image = new ImageIcon("./src/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(icon);
        
        image = new ImageIcon("./src/edu/unsis/view/images/mainLogo.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(logoStore.getWidth(),
                logoStore.getHeight(), Image.SCALE_DEFAULT));

        logoStore.setIcon(icon);
        
        image = new ImageIcon("./src/edu/unsis/view/images/minimizeUno.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonMin.getWidth(),
                buttonMin.getHeight(), Image.SCALE_DEFAULT));

        iconMinN = icon;
        buttonMin.setIcon(icon);
        
        image = new ImageIcon("./src/edu/unsis/view/images/closeUno.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonClose.getWidth(),
                buttonClose.getHeight(), Image.SCALE_DEFAULT));

        iconCloseN = icon;
        buttonClose.setIcon(icon);
        
        image = new ImageIcon("./src/edu/unsis/view/images/closeDos.png");
        iconClose = new ImageIcon(image.getImage().getScaledInstance(buttonClose.getWidth(),
                buttonClose.getHeight(), Image.SCALE_DEFAULT));
        
        image = new ImageIcon("./src/edu/unsis/view/images/minimizeDos.png");
        iconMin = new ImageIcon(image.getImage().getScaledInstance(buttonClose.getWidth(),
                buttonClose.getHeight(), Image.SCALE_DEFAULT));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoStore = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonMin = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logoStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 230, 220));
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 325, 430));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 0, 40, 40));

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
        jPanel2.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 40, 40));

        txtPass.setBackground(new java.awt.Color(102, 153, 255));
        txtPass.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 210, 30));
        txtPass.getAccessibleContext().setAccessibleName("");

        txtUser.setBackground(new java.awt.Color(102, 153, 255));
        txtUser.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("User");
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 210, 30));
        txtUser.getAccessibleContext().setAccessibleName("");

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Acceder");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 30));

        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Olvido su contraseña?");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 70, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 0, 325, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        this.setCursor(HAND_CURSOR);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        this.setCursor(NORMAL);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = txtUser.getText().trim();
        String pass = txtPass.getText().trim();
        boolean band = true;
        if (user.equals("")) {
            band = false;
            txtUser.setBackground(Color.red);
        } else {
            txtUser.setBackground(new Color(102,153,255));
        }
        
        if (pass.equals("")) {
            band = false;
            txtPass.setBackground(Color.red);
        } else {
            txtPass.setBackground(new Color(102,153,255));
        }
        
        if (band) {
            new MainMenu().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_formMouseDragged

    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    private void buttonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseEntered
        this.buttonMin.setIcon(iconMin);
    }//GEN-LAST:event_buttonMinMouseEntered

    private void buttonCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseEntered
        this.buttonClose.setIcon(iconClose);
    }//GEN-LAST:event_buttonCloseMouseEntered

    private void buttonCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseExited
        this.buttonClose.setIcon(iconCloseN);
    }//GEN-LAST:event_buttonCloseMouseExited

    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setIcon(iconMinN);
    }//GEN-LAST:event_buttonMinMouseExited

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
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoStore;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
