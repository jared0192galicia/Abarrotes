/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 22/may/2023
 * Descripcion: Busca y modifica productos
 */

package edu.unsis.view;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entity.products.Product;


public class SearchProduct extends javax.swing.JFrame {

    private ArrayList<Product> products = MainMenu.products;
    private DefaultTableModel model;
    
    public SearchProduct() {
        initComponents();
        
        System.out.println("aqui");
        
        this.setResizable(false);
        this.setTitle("Modificar");
        this.setLocationRelativeTo(null);
        this.setSize(878, 640);
        this.setVisible(true);
        
        System.out.println("aqui 2");
        ImageIcon image = new ImageIcon("./src/edu/unsis/view/images/"
                + "wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(
                wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        
        System.out.println("aqui 3");
        wallpaper.setIcon(icon);
        
        model = new DefaultTableModel();
        createDefaultModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        Modelo = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        txtExist = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtCadDay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCadMonth = new javax.swing.JTextField();
        txtCadYear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buttonMin = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(102, 153, 255));
        txtName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 210, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Existencia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtMarca.setEditable(false);
        txtMarca.setBackground(new java.awt.Color(102, 153, 255));
        txtMarca.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 210, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtModelo.setEditable(false);
        txtModelo.setBackground(new java.awt.Color(102, 153, 255));
        txtModelo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 210, 30));

        Modelo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Modelo.setForeground(new java.awt.Color(255, 255, 255));
        Modelo.setText("Modelo");
        jPanel1.add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        txtPrice.setEditable(false);
        txtPrice.setBackground(new java.awt.Color(102, 153, 255));
        txtPrice.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 210, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "              Caducable", "              No caducable" }));
        comboType.setEnabled(false);
        comboType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTypeItemStateChanged(evt);
            }
        });
        jPanel1.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 210, -1));

        txtExist.setEditable(false);
        txtExist.setBackground(new java.awt.Color(102, 153, 255));
        txtExist.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtExist.setForeground(new java.awt.Color(255, 255, 255));
        txtExist.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 210, 30));

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Buscar y modificar");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 270, 140));

        txtCadDay.setEditable(false);
        txtCadDay.setBackground(new java.awt.Color(102, 153, 255));
        txtCadDay.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadDay.setForeground(new java.awt.Color(255, 255, 255));
        txtCadDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCadDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 210, 30));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dia");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mes");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        txtCadMonth.setEditable(false);
        txtCadMonth.setBackground(new java.awt.Color(102, 153, 255));
        txtCadMonth.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadMonth.setForeground(new java.awt.Color(255, 255, 255));
        txtCadMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCadMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 210, 30));

        txtCadYear.setEditable(false);
        txtCadYear.setBackground(new java.awt.Color(102, 153, 255));
        txtCadYear.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadYear.setForeground(new java.awt.Color(255, 255, 255));
        txtCadYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCadYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 210, 30));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Año");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

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
        jPanel1.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 40, 40));

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
        jPanel1.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 40));

        buttonSearch.setText("Buscar");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 220, 40));

        txtCode.setBackground(new java.awt.Color(102, 153, 255));
        txtCode.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 210, 30));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Codigo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, 290));
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTypeItemStateChanged
        int index = this.comboType.getSelectedIndex();

        if (index == 0) {
            this.txtCadDay.setEnabled(true);
            this.txtCadYear.setEnabled(true);
            this.txtCadMonth.setEnabled(true);
        } else {
            this.txtCadDay.setEnabled(false);
            this.txtCadYear.setEnabled(false);
            this.txtCadMonth.setEnabled(false);
        }
    }//GEN-LAST:event_comboTypeItemStateChanged
    private void createDefaultModel() {
        model.addColumn("Nombre");
        model.addColumn("Codigo");
        model.addColumn("Modelo");
        model.addColumn("Existencia");
        model.addColumn("Precio");
        
        String row[];
        String aux;
        
        for (Product product : products) {
            row = new String[5];
            
            row[1] = product.getName();
            row[2] = product.getCode();
            row[3] = product.getModelo();
            row[4] = String.valueOf(product.getExistencia());
            row[5] = String.valueOf(product.getPrice());
            
            model.addRow(row);
        }
        
    }
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String code = this.txtCode.getText().trim();
        
        if (code.equals("")) {
            // Set color red
            
        } else {
            // Set color default
            
            for (Product product : products) {
                if (code.equals(product.getCode())) {
                    /* fill txtField with data */
                } else {
                    JOptionPane.showMessageDialog(null, "El "
                            + "codifo ingresado no existe");
                }
            }
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMinActionPerformed

    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered
        this.buttonExit.setForeground(Color.red);
    }//GEN-LAST:event_buttonExitMouseEntered

    private void buttonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseEntered
        this.buttonMin.setForeground(Color.red);
    }//GEN-LAST:event_buttonMinMouseEntered

    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setForeground(Color.white);
    }//GEN-LAST:event_buttonMinMouseExited

    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited
        this.buttonExit.setForeground(Color.white);
    }//GEN-LAST:event_buttonExitMouseExited

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Modelo;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtCadDay;
    private javax.swing.JTextField txtCadMonth;
    private javax.swing.JTextField txtCadYear;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtExist;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
