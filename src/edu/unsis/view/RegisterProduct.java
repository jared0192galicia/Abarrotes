package edu.unsis.view;

import java.awt.Color;
import java.util.ArrayList;
import model.entity.products.Expired;
import model.entity.products.NotExpired;
import model.entity.products.Product;

public class RegisterProduct extends javax.swing.JFrame {

    private ArrayList<Product> products = new ArrayList<>();

    public RegisterProduct() {
        initComponents();
        this.setSize(878, 626);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        Modelo = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        checkCode = new javax.swing.JCheckBox();
        txtExist = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txtCadDay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCadMonth = new javax.swing.JTextField();
        txtCadYear = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(102, 153, 255));
        txtName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 210, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtCode.setEditable(false);
        txtCode.setBackground(new java.awt.Color(102, 153, 255));
        txtCode.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 210, 30));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setText("Existencia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        txtMarca.setBackground(new java.awt.Color(102, 153, 255));
        txtMarca.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 210, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtModelo.setBackground(new java.awt.Color(102, 153, 255));
        txtModelo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 210, 30));

        Modelo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Modelo.setText("Modelo");
        jPanel1.add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        txtPrice.setBackground(new java.awt.Color(102, 153, 255));
        txtPrice.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 210, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "              Caducable", "              No caducable" }));
        comboType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTypeItemStateChanged(evt);
            }
        });
        jPanel1.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 210, -1));

        checkCode.setSelected(true);
        checkCode.setText("Codigo automatico");
        checkCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkCodeItemStateChanged(evt);
            }
        });
        jPanel1.add(checkCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        txtExist.setBackground(new java.awt.Color(102, 153, 255));
        txtExist.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtExist.setForeground(new java.awt.Color(255, 255, 255));
        txtExist.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 210, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REGISTRAR PRODUCTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setText("Precio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 460, 140));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 220, 45));

        txtCadDay.setBackground(new java.awt.Color(102, 153, 255));
        txtCadDay.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadDay.setForeground(new java.awt.Color(255, 255, 255));
        txtCadDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCadDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 210, 30));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setText("Dia");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel9.setText("Mes");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        txtCadMonth.setBackground(new java.awt.Color(102, 153, 255));
        txtCadMonth.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadMonth.setForeground(new java.awt.Color(255, 255, 255));
        txtCadMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCadMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 210, 30));

        txtCadYear.setBackground(new java.awt.Color(102, 153, 255));
        txtCadYear.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadYear.setForeground(new java.awt.Color(255, 255, 255));
        txtCadYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCadYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 210, 30));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setText("Año");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jButton2.setText("-");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 40, 40));

        jButton3.setText("x");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTypeItemStateChanged
        int index = this.comboType.getSelectedIndex();

        if (index == 0) {
            this.txtCadDay.setEditable(true);
            this.txtCadYear.setEnabled(true);
            this.txtCadMonth.setEditable(true);
        } else {
            this.txtCadDay.setEditable(false);
            this.txtCadYear.setEnabled(false);
            this.txtCadMonth.setEditable(false);
        }
    }//GEN-LAST:event_comboTypeItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int indexType = this.comboType.getSelectedIndex();
        boolean indexCode = this.checkCode.isSelected();
        boolean band = true;

        String name = this.txtName.getText().trim();
        String price = this.txtPrice.getText().trim();
        String existence = this.txtExist.getText().trim();
        String description = this.txtDescription.getText().trim();
        String marca = this.txtMarca.getText().trim();
        String model = this.txtModelo.getText().trim();

        String year = "";
        String day = "";
        String month = "";
        String code = "";

        if (name.equals("")) {
            this.txtName.setBackground(Color.red);
            band = false;
        } else {
            this.txtName.setBackground(new Color(102, 153, 255));
        }

        if (price.equals("")) {
            this.txtPrice.setBackground(Color.red);
            band = false;
        } else {
            this.txtPrice.setBackground(new Color(102, 153, 255));
        }

        if (existence.equals("")) {
            this.txtExist.setBackground(Color.red);
            band = false;
        } else {
            this.txtExist.setBackground(new Color(102, 153, 255));
        }

        if (description.equals("")) {
            this.txtDescription.setBackground(Color.red);
            band = false;
        } else {
            this.txtDescription.setBackground(new Color(102, 153, 255));
        }

        if (marca.equals("")) {
            this.txtMarca.setBackground(Color.red);
            band = false;
        } else {
            this.txtMarca.setBackground(new Color(102, 153, 255));
        }

        if (model.equals("")) {
            this.txtModelo.setBackground(Color.red);
            band = false;
        } else {
            this.txtModelo.setBackground(new Color(102, 153, 255));
        }

        // Components of the Objects Expired
        if (indexType == 0) {

            day = this.txtCadDay.getText().trim();
            month = this.txtCadMonth.getText().trim();
            year = this.txtCadYear.getText().trim();

            if (day.equals("")) {
                this.txtCadDay.setBackground(Color.red);
                band = false;
            } else {
                this.txtCadDay.setBackground(new Color(102, 153, 255));
            }

            if (month.equals("")) {
                this.txtCadMonth.setBackground(Color.red);
                band = false;
            } else {
                this.txtCadMonth.setBackground(new Color(102, 153, 255));
            }

            if (year.equals("")) {
                this.txtCadYear.setBackground(Color.red);
                band = false;
            } else {
                this.txtCadYear.setBackground(new Color(102, 153, 255));
            }

        }
        if (!indexCode) {
            code = this.txtCode.getText().trim();

            if (code.equals("")) {
                this.txtCode.setBackground(Color.red);
                band = false;

            } else {
                this.txtCode.setBackground(new Color(102, 153, 255));

            }
        } else {
            this.txtCode.setBackground(new Color(102, 153, 255));
        }

        if (band && (indexType == 0)) {
            Product p = new Expired(day, year, month, name, code, Double.parseDouble(price), description);
            products.add(p);
        } else if(band) { 
            Product p = new NotExpired(name, code, 
                    Integer.parseInt(price), description);
            products.add(p);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkCodeItemStateChanged
        txtCode.setEditable(!checkCode.isSelected());
    }//GEN-LAST:event_checkCodeItemStateChanged

    private boolean dataValidate() {
        boolean band = true;

        // Compare all components with with ""
        if (true) {

        }

        return band;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Modelo;
    private javax.swing.JCheckBox checkCode;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    // End of variables declaration//GEN-END:variables
}
