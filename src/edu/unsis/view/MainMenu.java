/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 22/may/2023
 * Descripcion: Menu principal de opciones
 */
package edu.unsis.view;

import edu.unsis.controller.IMainMenuController;
import edu.unsis.controller.MainMenuControllerImpl;
import edu.unsis.utilities.Data;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import edu.unsis.model.entity.Product;

public class MainMenu extends javax.swing.JFrame {

    public static ArrayList<Product> products;
    public static Data data;
    public static IMainMenuController controller;

    public MainMenu() {
        initComponents();
        this.setSize(850, 550);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ImageIcon image = new ImageIcon("./src/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(icon);

        image = new ImageIcon("./src/edu/unsis/view/images/user-button.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonUsers.getWidth(),
                buttonUsers.getHeight(), Image.SCALE_DEFAULT));

        buttonUsers.setIcon(icon);

        image = new ImageIcon("./src/edu/unsis/view/images/inventario.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonUsers.getWidth(),
                buttonUsers.getHeight(), Image.SCALE_DEFAULT));

        buttonInvent.setIcon(icon);

        image = new ImageIcon("./src/edu/unsis/view/images/invoice.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonSale.getWidth(),
                buttonSale.getHeight(), Image.SCALE_DEFAULT));

        buttonSale.setIcon(icon);

        image = new ImageIcon("./src/edu/unsis/view/images/print.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonPrint.getWidth(),
                buttonPrint.getHeight(), Image.SCALE_DEFAULT));

        buttonPrint.setIcon(icon);

        if (products == null) {

            controller = new MainMenuControllerImpl();
            loadData();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonUsers = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        buttonRegisterProduct = new javax.swing.JButton();
        buttonPrint = new javax.swing.JButton();
        buttonSale = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonMin = new javax.swing.JButton();
        buttonInvent = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 30, -1, -1));

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
        jPanel1.add(buttonUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 170, 160));

        button2.setBorder(null);
        button2.setBorderPainted(false);
        button2.setContentAreaFilled(false);
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 170, 160));

        buttonRegisterProduct.setBorder(null);
        buttonRegisterProduct.setBorderPainted(false);
        buttonRegisterProduct.setContentAreaFilled(false);
        buttonRegisterProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegisterProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRegisterProduct.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonRegisterProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterProductActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRegisterProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 170, 160));

        buttonPrint.setBorder(null);
        buttonPrint.setBorderPainted(false);
        buttonPrint.setContentAreaFilled(false);
        buttonPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonPrint.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel1.add(buttonPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 170, 160));

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
        jPanel1.add(buttonSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 140, 160));

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
        jPanel1.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 40, 40));

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
        jPanel1.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 40, 40));

        buttonInvent.setBorder(null);
        buttonInvent.setBorderPainted(false);
        buttonInvent.setContentAreaFilled(false);
        buttonInvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonInvent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonInvent.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonInvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInventActionPerformed(evt);
            }
        });
        jPanel1.add(buttonInvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, 160));
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Use controller for load data
     */
    public void loadData() {
        products = controller.getData();
        for (Product product : products) {
            System.out.println("product = " + product);
        }
    }

    private void buttonUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUsersActionPerformed
        new UserRegister().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonUsersActionPerformed

    private void buttonRegisterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterProductActionPerformed
        new RegisterProduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonRegisterProductActionPerformed

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
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMinActionPerformed

    private void buttonSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaleActionPerformed

    private void buttonInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInventActionPerformed
        new Inventory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonInventActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button2;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonInvent;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonRegisterProduct;
    private javax.swing.JButton buttonSale;
    private javax.swing.JButton buttonUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
