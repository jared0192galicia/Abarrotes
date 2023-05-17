package edu.unsis.view;

public class RegisterProduct extends javax.swing.JFrame {

    
    public RegisterProduct() {
        initComponents();
        this.setSize(878, 551);
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
        txt2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(102, 153, 255));
        txtName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setText("jTextField1");
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 210, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtCode.setEditable(false);
        txtCode.setBackground(new java.awt.Color(102, 153, 255));
        txtCode.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 210, 30));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setText("Existencia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        txt2.setBackground(new java.awt.Color(102, 153, 255));
        txt2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setText("jTextField1");
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 210, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txt3.setBackground(new java.awt.Color(102, 153, 255));
        txt3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setText("jTextField1");
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 210, 30));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        txtPrice.setBackground(new java.awt.Color(102, 153, 255));
        txtPrice.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrice.setText("jTextField1");
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 210, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpieza", "Aliemento", "Aceo personal", " ", " " }));
        jPanel1.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 210, -1));

        checkCode.setSelected(true);
        checkCode.setText("Codigo automatico");
        jPanel1.add(checkCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtExist.setBackground(new java.awt.Color(102, 153, 255));
        txtExist.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtExist.setForeground(new java.awt.Color(255, 255, 255));
        txtExist.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtExist.setText("jTextField1");
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 460, 140));

        jButton1.setText("Registrar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 220, 45));

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkCode;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtExist;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
