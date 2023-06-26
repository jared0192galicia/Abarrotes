/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 19 / Jun / 2023
 * modificado: 20 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.view;

import edu.unsis.controller.StatisticsController;
import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.Sale;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Statistics extends javax.swing.JFrame {

    private final StatisticsController controller;
    private final ArrayList<Sale> sales;
    private final ArrayList<Product> products;

    private final DefaultTableModel modelSale;
    private final DefaultTableModel modelProduct;

    private int totalSales;
    private double totalIncome;

    /**
     *
     */
    public Statistics() {
        initComponents();

        this.setSize(744, 587);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        controller = new StatisticsController();
        sales = controller.load();
        products = MainMenu.products;

        ImageIcon image = new ImageIcon(
                "./src/main/java/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(
                wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        this.wallpaper.setIcon(icon);

        image = new ImageIcon("./src/main/java/edu/unsis/view/images/home.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonHome.getWidth(),
                buttonHome.getHeight(), Image.SCALE_DEFAULT));

        buttonHome.setIcon(icon);

        tableProducts.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableProducts.getTableHeader().setBackground(new Color(0, 153, 153));
        tableProducts.getTableHeader().setForeground(new Color(255, 255, 255));

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tableProducts.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tableProducts.getColumnModel().getColumn(1).setCellRenderer(tcr);

        tableSales.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableSales.getTableHeader().setBackground(new Color(0, 153, 153));
        tableSales.getTableHeader().setForeground(new Color(255, 255, 255));

        tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tableSales.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tableSales.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tableSales.getColumnModel().getColumn(2).setCellRenderer(tcr);

        modelSale = (DefaultTableModel) tableSales.getModel();
        modelProduct = (DefaultTableModel) tableProducts.getModel();

        this.fillTbles();

        calculate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonHome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSales = new javax.swing.JTable();
        buttonExit = new javax.swing.JButton();
        buttonMin = new javax.swing.JButton();
        labelProducts = new javax.swing.JLabel();
        labelSales = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        tableProducts.setBackground(new java.awt.Color(255, 255, 255));
        tableProducts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableProducts.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tableProducts.setForeground(new java.awt.Color(0, 0, 0));
        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProducts.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableProducts.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableProducts.setShowGrid(true);
        tableProducts.setShowVerticalLines(false);
        tableProducts.setSurrendersFocusOnKeystroke(true);
        tableProducts.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(tableProducts);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 300, 200));

        tableSales.setBackground(new java.awt.Color(255, 255, 255));
        tableSales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableSales.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tableSales.setForeground(new java.awt.Color(0, 0, 0));
        tableSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vendedor", "Monto", "Fecha", "código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSales.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableSales.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableSales.setShowGrid(true);
        tableSales.setShowVerticalLines(false);
        tableSales.setSurrendersFocusOnKeystroke(true);
        tableSales.getTableHeader().setResizingAllowed(false);
        tableSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSales);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 350, 200));

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
        getContentPane().add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 0, 40, 40));

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
        getContentPane().add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 40, 40));

        labelProducts.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        labelProducts.setForeground(new java.awt.Color(255, 255, 255));
        labelProducts.setText("Productos vendidos");
        getContentPane().add(labelProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        labelSales.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        labelSales.setForeground(new java.awt.Color(255, 255, 255));
        labelSales.setText("Ventas realizadas");
        getContentPane().add(labelSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 1
     *
     * @param evt
     */
    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void tableSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalesMouseClicked
        String row[];
        String aux = "";
        String codes = tableSales.getValueAt(tableSales.getSelectedRow(), 3).toString();
        modelProduct.setRowCount(0);
        for (Sale sale : sales) {
            if (sale.getCode().equals(codes)) {
                codes = sale.getCodesProducts();
            }
        }

        for (int i = 0; i < codes.length(); i++) {
            row = new String[2];

            if (codes.length() - 1 != 0) {
                aux += codes.charAt(i);

                if (aux.length() == 14) {
                    for (Product product : products) {
                        if (product.getCode().equals(aux)) {
                            row[0] = product.getName();
                            row[1] = String.valueOf(countRepeat(aux));
                            modelProduct.addRow(row);
                        }
                    }
                    aux = "";
                }
            }
        }
        tableProducts.setModel(modelProduct);
    }//GEN-LAST:event_tableSalesMouseClicked

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
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    private void fillTbles() {
        String row[];
        modelSale.setRowCount(0);

        for (Sale sale : sales) {
            row = new String[4];

            row[0] = sale.getSaleFor();
            row[1] = String.valueOf(sale.getIncome());
            row[2] = sale.getDate();
            row[3] = sale.getCode();

            modelSale.addRow(row);
        }

        tableSales.setModel(modelSale);
    }

    private int countRepeat(String code) {
        int count = 0;

        for (Product product : products) {
            if (product.getCode().equals(code)) {
                count++;
            }
        }

        return count;
    }

    private void calculate() {

        totalSales = sales.size();
        totalIncome = 0;

        for (Sale sale : sales) {
            totalIncome += sale.getIncome();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(255, 0, 0));//rojo
//        g.fillRect(100, 150, 23, 40);
//        g.drawString("No Reparado", 10, 168);
//        g.drawString("Cantidad:" + 43, 10, 183);
        g.fillRect(50, 500 - totalSales, 50, totalSales * 10);
        
        g.setColor(new Color(50, 100, 100));//rojo
        g.fillRect(150, (int) (500 - totalIncome), 50, (int) (totalIncome / 10));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Statistics().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelProducts;
    private javax.swing.JLabel labelSales;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTable tableSales;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
