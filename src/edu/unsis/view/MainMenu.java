/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 22/may/2023
 * Descripcion: Menu principal de opciones
 */

package edu.unsis.view;

import edu.unsis.model.Data;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import model.entity.products.Product;


public class MainMenu extends javax.swing.JFrame {

    public static ArrayList<Product> products;
    public static Data data;
    
    public MainMenu() {
        initComponents();
        this.setSize(850, 550);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        
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
        data = new Data();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonInvent = new javax.swing.JButton();
        buttonUsers = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        buttonRegisterProduct = new javax.swing.JButton();
        buttonPrint = new javax.swing.JButton();
        buttonSale = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 30, -1, -1));

        buttonInvent.setBackground(new java.awt.Color(0, 102, 102));
        buttonInvent.setBorder(null);
        buttonInvent.setBorderPainted(false);
        buttonInvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonInvent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonInvent.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonInvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonInventMouseEntered(evt);
            }
        });
        jPanel1.add(buttonInvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, 160));

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
        jPanel1.add(buttonRegisterProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 170, 160));

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
        jPanel1.add(buttonSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 140, 160));
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadData() {
        products = Data.load();
    }
    
    private void buttonUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUsersActionPerformed

    private void buttonInventMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonInventMouseEntered
        this.buttonInvent.setBackground(new Color(10, true));
    }//GEN-LAST:event_buttonInventMouseEntered

    private void buttonRegisterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterProductActionPerformed
       new RegisterProduct().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_buttonRegisterProductActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button2;
    private javax.swing.JButton buttonInvent;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonRegisterProduct;
    private javax.swing.JButton buttonSale;
    private javax.swing.JButton buttonUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
