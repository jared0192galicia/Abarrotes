/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 19 / Jun / 2023
 * modificado: 19 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.view;

import edu.unsis.controller.StatisticsController;
import edu.unsis.model.entity.Sale;
import java.awt.Graphics;
import java.util.ArrayList;

public class Statistics extends javax.swing.JFrame {

    private StatisticsController controller;
    private ArrayList<Sale> sales;
    
    public Statistics() {
        initComponents();
        
        this.setSize(637, 414);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        controller = new StatisticsController();
        sales = controller.load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 700, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void calculate() {
        
        int totalSales = sales.size();
        double totalIncome = 0;
        
        for (Sale sale : sales) {
            totalIncome += sale.getIncome();
        }
    }
    
    @Override
    public void paint(Graphics g) {
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Statistics().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
