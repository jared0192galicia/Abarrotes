package edu.unsis.view;

import edu.unsis.controller.SalesController;
import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.Sale;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Sales extends javax.swing.JFrame {

    private final DefaultTableModel model;
    private final ArrayList<Product> products = MainMenu.products;
    private final ArrayList<Product> productsSelected;

    private final SalesController controller;
    private double priceTotal;

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        productsSelected = new ArrayList<>();

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

        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        table.getTableHeader().setBackground(new Color(0, 153, 153));
        table.getTableHeader().setForeground(new Color(255, 255, 255));

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(tcr);
        table.getColumnModel().getColumn(1).setCellRenderer(tcr);
        table.getColumnModel().getColumn(2).setCellRenderer(tcr);
        table.getColumnModel().getColumn(3).setCellRenderer(tcr);

        model = (DefaultTableModel) table.getModel();
        controller = new SalesController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        buttonMin = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        scrollText = new javax.swing.JScrollPane();
        txtCodes = new javax.swing.JTextArea();
        txtTotal = new javax.swing.JTextField();
        scrollTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonContinue = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        buttonFinal = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panel.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 40, 40));

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
        panel.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 40));

        txtCodes.setBackground(new java.awt.Color(102, 153, 255));
        txtCodes.setColumns(15);
        txtCodes.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCodes.setForeground(new java.awt.Color(255, 255, 255));
        txtCodes.setLineWrap(true);
        txtCodes.setRows(5);
        txtCodes.setWrapStyleWord(true);
        txtCodes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodes.setMargin(new java.awt.Insets(0, 10, 0, 10));
        txtCodes.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtCodes.setSelectionColor(new java.awt.Color(0, 102, 102));
        scrollText.setViewportView(txtCodes);

        panel.add(scrollText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 250, 120));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(102, 153, 255));
        txtTotal.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("Total");
        txtTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 210, 30));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Marca", "Modelo", "Precio"
            }
        ));
        table.setShowVerticalLines(false);
        table.getTableHeader().setReorderingAllowed(false);
        scrollTable.setViewportView(table);

        panel.add(scrollTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 290));

        buttonContinue.setBackground(new java.awt.Color(0, 102, 102));
        buttonContinue.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        buttonContinue.setForeground(new java.awt.Color(255, 255, 255));
        buttonContinue.setText("Continuar");
        buttonContinue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContinueActionPerformed(evt);
            }
        });
        panel.add(buttonContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 210, 40));

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
        panel.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        labelTitle.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Ventas");
        panel.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        buttonFinal.setBackground(new java.awt.Color(0, 102, 102));
        buttonFinal.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        buttonFinal.setForeground(new java.awt.Color(255, 255, 255));
        buttonFinal.setText("Finalizar");
        buttonFinal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonFinal.setEnabled(false);
        buttonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalActionPerformed(evt);
            }
        });
        panel.add(buttonFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 210, 40));
        panel.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
     * Minimize this frame
     *
     * @param evt
     */
    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

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
     *
     * @param evt
     */
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    /**
     * Return to home
     *
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
     * Fill table with codes input
     *
     * @param evt
     */
    private void buttonContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonContinueActionPerformed
        String code = txtCodes.getText().trim();
        priceTotal = 0;

        // Valid input data exist
        if (code.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los productos",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Get codes for products with 14 chars
            String aux = "";
            ArrayList<String> codes = new ArrayList<>();
            for (int i = 0; i < code.length(); i++) {

                if (code.length() - 1 != 0) {
                    aux += code.charAt(i);

                    if (aux.length() == 14) {
                        codes.add(aux);
                        aux = "";
                    }
                }
            }

            productsSelected.clear();

            for (String cod : codes) {
                for (Product product : products) {
                    if (product.getCode().equals(cod)) {
                        productsSelected.add(product);
                    }
                }
            }

            this.buttonFinal.setEnabled(true);
            createModel(codes);
        }
    }//GEN-LAST:event_buttonContinueActionPerformed

    /**
     * Call to controller for generate tiked
     *
     * @param evt Arg of the event
     */
    private void buttonFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalActionPerformed

        Sale sale = new Sale();
        sale.setCode(Sale.generateCode());
        sale.setCodesProducts(this.txtCodes.getText().trim());
        sale.setDate(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").
                format(Calendar.getInstance().getTime()));
        sale.setIncome(priceTotal);

        controller.generateReport(productsSelected, sale,
                "/home/elietzer/NetBeansProjects/Abarrotes/");

        controller.registerSale(productsSelected, sale);

    }//GEN-LAST:event_buttonFinalActionPerformed

    /**
     * Mod model with products ingres in txtCodes for the table
     *
     * @param codes
     */
    private void createModel(ArrayList<String> codes) {
        model.setRowCount(0);
        String row[] = new String[4];
        for (String code : codes) {
            for (Product product : productsSelected) {
                if (code.equals(product.getCode())) {
                    row[0] = product.getName();
                    row[1] = product.getMarca();
                    row[2] = product.getModelo();
                    row[3] = String.valueOf(product.getPrice());
                    priceTotal += product.getPrice();

                    model.addRow(row);
                }
            }
        }
        table.setModel(model);
        txtTotal.setText(String.valueOf(priceTotal));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Sales().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonContinue;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonFinal;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMin;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JScrollPane scrollText;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtCodes;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
