/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 11/ Jun / 2023
 * Descripcion: Menu principal de opciones
 */
package edu.unsis.view;

import edu.unsis.controller.MainMenuController;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import edu.unsis.model.entity.Product;

public final class MainMenu extends javax.swing.JFrame {

    public static ArrayList<Product> products;
    public static MainMenuController controller;

    /**
     * Contructor for main window. Call funtions for loas data and setter images
     */
    public MainMenu() {
        initComponents();
        this.setSize(850, 550);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("./src/main/java/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/user-button.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonUsers.getWidth(),
                buttonUsers.getHeight(), Image.SCALE_DEFAULT));

        buttonUsers.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/inventario.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonUsers.getWidth(),
                buttonUsers.getHeight(), Image.SCALE_DEFAULT));

        buttonInvent.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/invoice.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonSale.getWidth(),
                buttonSale.getHeight(), Image.SCALE_DEFAULT));

        buttonSale.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/print.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonPrint.getWidth(),
                buttonPrint.getHeight(), Image.SCALE_DEFAULT));

        buttonPrint.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/productButton.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonPrint.getWidth(),
                buttonPrint.getHeight(), Image.SCALE_DEFAULT));

        buttonRegisterProduct.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/grafica.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonPrint.getWidth(),
                buttonPrint.getHeight(), Image.SCALE_DEFAULT));

        buttonStatistics.setIcon(icon);

        if (products == null) {

            controller = new MainMenuController();
            loadData();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        buttonUsers = new javax.swing.JButton();
        buttonStatistics = new javax.swing.JButton();
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

        labelTitle.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("MENÚ PRINCIPAL");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 30, -1, -1));

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
        jPanel1.add(buttonUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 170, 160));

        buttonStatistics.setBorder(null);
        buttonStatistics.setBorderPainted(false);
        buttonStatistics.setContentAreaFilled(false);
        buttonStatistics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonStatistics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonStatistics.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStatisticsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 170, 160));

        buttonRegisterProduct.setToolTipText("Registrar producto");
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

        buttonPrint.setToolTipText("Reportes");
        buttonPrint.setBorder(null);
        buttonPrint.setBorderPainted(false);
        buttonPrint.setContentAreaFilled(false);
        buttonPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonPrint.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 170, 160));

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

        buttonInvent.setToolTipText("Iventario");
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
    }

    /**
     * Change to frame for gestion of the users a product
     * @param evt 
     */
    private void buttonUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUsersActionPerformed
        new UserRegister().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonUsersActionPerformed

    /**
     * Change to frame for create a product
     * @param evt 
     */
    private void buttonRegisterProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterProductActionPerformed
        new RegisterProduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonRegisterProductActionPerformed

    /**
     * Change foreground of button. Event hover
     * @param evt with data of the event
     */
    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered
        this.buttonExit.setForeground(Color.red);
    }//GEN-LAST:event_buttonExitMouseEntered

    /**
     * Change foreground of button. Event hover
     * @param evt with data of the event
     */
    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited
        this.buttonExit.setForeground(Color.white);
    }//GEN-LAST:event_buttonExitMouseExited

    /**
     * Change foreground of button. Event hover
     * @param evt with data of the event
     */
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    /**
     * Change foreground of button. Event hover
     * @param evt with data of the event
     */
    private void buttonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseEntered
        this.buttonMin.setForeground(Color.red);
    }//GEN-LAST:event_buttonMinMouseEntered

    /**
     * Change foreground of button. Event hover
     * @param evt with data of the event
     */
    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setForeground(Color.white);
    }//GEN-LAST:event_buttonMinMouseExited

    /**
     * Minimize this frame
     *
     * @param evt
     */
    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_buttonMinActionPerformed

    /**
     * Change to frame for Sales
     * @param evt 
     */
    private void buttonSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaleActionPerformed
        new Sales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonSaleActionPerformed

    /**
     * Change to frame for invent
     * @param evt 
     */
    private void buttonInventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInventActionPerformed
        new Inventory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonInventActionPerformed

    private void buttonStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStatisticsActionPerformed
        new Statistics().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonStatisticsActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
        controller.createReport(products);
    }//GEN-LAST:event_buttonPrintActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonInvent;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonRegisterProduct;
    private javax.swing.JButton buttonSale;
    private javax.swing.JButton buttonStatistics;
    private javax.swing.JButton buttonUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
