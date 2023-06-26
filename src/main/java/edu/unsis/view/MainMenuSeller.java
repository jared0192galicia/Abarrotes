/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 11 / Jun / 2023
 * Descripcion: Registra Usuarios
 */
package edu.unsis.view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author elietzer
 */
public class MainMenuSeller extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuSeller
     */
    public MainMenuSeller() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(712, 401);

        ImageIcon image = new ImageIcon("./src/main/java/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        this.wallpaper.setIcon(icon);
        
        image = new ImageIcon("./src/main/java/edu/unsis/view/images/user-button.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonUsers.getWidth(),
                buttonUsers.getHeight(), Image.SCALE_DEFAULT));

        buttonUsers.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/invoice.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonSale.getWidth(),
                buttonSale.getHeight(), Image.SCALE_DEFAULT));

        buttonSale.setIcon(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        buttonSale = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonMin = new javax.swing.JButton();
        buttonUsers = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("MENÚ PRINCIPAL");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        buttonSale.setToolTipText("Ventas");
        buttonSale.setBorder(null);
        buttonSale.setBorderPainted(false);
        buttonSale.setContentAreaFilled(false);
        buttonSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSale.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaleActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 160));

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
        jPanel1.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 40, 40));

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
        jPanel1.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 40));

        buttonUsers.setToolTipText("Gestiona usuarios");
        buttonUsers.setBorder(null);
        buttonUsers.setBorderPainted(false);
        buttonUsers.setContentAreaFilled(false);
        buttonUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUsers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonUsers.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUsersActionPerformed(evt);
            }
        });
        jPanel1.add(buttonUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 170, 160));
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaleActionPerformed
        new Sales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonSaleActionPerformed

    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered
        this.buttonExit.setForeground(Color.red);
    }//GEN-LAST:event_buttonExitMouseEntered

    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited
        this.buttonExit.setForeground(Color.white);
    }//GEN-LAST:event_buttonExitMouseExited

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseEntered
        this.buttonMin.setForeground(Color.red);
    }//GEN-LAST:event_buttonMinMouseEntered

    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setForeground(Color.white);
    }//GEN-LAST:event_buttonMinMouseExited

    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    private void buttonUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUsersActionPerformed
        new UpdateUserSeller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonUsersActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuSeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonSale;
    private javax.swing.JButton buttonUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
