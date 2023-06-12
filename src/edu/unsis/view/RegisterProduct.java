/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 11 / Jun / 2023
 * Descripcion: Registra productos con interfaz grafica
 */
package edu.unsis.view;

import edu.unsis.utilities.CodesProducts;
import edu.unsis.controller.ProductController;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import edu.unsis.model.entity.User;
import edu.unsis.model.entity.Expired;
import edu.unsis.model.entity.NotExpired;
import edu.unsis.model.entity.Product;

public class RegisterProduct extends javax.swing.JFrame {

    private ArrayList<Product> products;
    private ProductController controller;

    /**
     * Constructor for frame. Setter images and create components
     */
    public RegisterProduct() {
        initComponents();
        this.setSize(878, 630);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.txtName.requestFocus(true);

        ImageIcon image = new ImageIcon("./src/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(icon);

        image = new ImageIcon("./src/edu/unsis/view/images/home.png");
        icon = new ImageIcon(image.getImage().getScaledInstance(buttonHome.getWidth(),
                buttonHome.getHeight(), Image.SCALE_DEFAULT));

        buttonHome.setIcon(icon);
        products = MainMenu.products;
        controller = new ProductController();
    }

    /**
     * 
     * @param title 
     */
    public RegisterProduct(String title) {
        initComponents();
        this.setSize(878, 630);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.labelTitle.setText(title);
        this.buttonRegister.setVisible(false);
        this.buttonRegister.setEnabled(false);

        ImageIcon image = new ImageIcon("./src/edu/unsis/view/images/wallpaperPrincipal.jpg");
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        labelExistence = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        labelModel = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        labelDescription = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        checkCode = new javax.swing.JCheckBox();
        txtExist = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        scrollTxtArea = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        buttonRegister = new javax.swing.JButton();
        txtCadDay = new javax.swing.JTextField();
        labelDay = new javax.swing.JLabel();
        labelMonth = new javax.swing.JLabel();
        txtCadMonth = new javax.swing.JTextField();
        txtCadYear = new javax.swing.JTextField();
        labelYear = new javax.swing.JLabel();
        buttonMin = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(102, 153, 255));
        txtName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 210, 30));

        labelName.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Nombre");
        jPanel1.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtCode.setEditable(false);
        txtCode.setBackground(new java.awt.Color(102, 153, 255));
        txtCode.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 210, 30));

        labelExistence.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelExistence.setForeground(new java.awt.Color(255, 255, 255));
        labelExistence.setText("Existencia");
        jPanel1.add(labelExistence, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        txtMarca.setBackground(new java.awt.Color(102, 153, 255));
        txtMarca.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 210, 30));

        labelMarca.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelMarca.setForeground(new java.awt.Color(255, 255, 255));
        labelMarca.setText("Marca");
        jPanel1.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtModelo.setBackground(new java.awt.Color(102, 153, 255));
        txtModelo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 210, 30));

        labelModel.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelModel.setForeground(new java.awt.Color(255, 255, 255));
        labelModel.setText("Modelo");
        jPanel1.add(labelModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        txtPrice.setBackground(new java.awt.Color(102, 153, 255));
        txtPrice.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 210, 30));

        labelDescription.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelDescription.setForeground(new java.awt.Color(255, 255, 255));
        labelDescription.setText("Descripción");
        jPanel1.add(labelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "              Caducable", "              No caducable" }));
        comboType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTypeItemStateChanged(evt);
            }
        });
        jPanel1.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 210, -1));

        checkCode.setForeground(new java.awt.Color(255, 255, 255));
        checkCode.setSelected(true);
        checkCode.setText("Código automatico");
        checkCode.setContentAreaFilled(false);
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
        txtExist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 210, 30));

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("REGISTRAR PRODUCTO");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        labelPrice.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(255, 255, 255));
        labelPrice.setText("Precio");
        jPanel1.add(labelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        txtDescription.setBackground(new java.awt.Color(102, 153, 255));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setRows(5);
        txtDescription.setAutoscrolls(false);
        txtDescription.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scrollTxtArea.setViewportView(txtDescription);

        jPanel1.add(scrollTxtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 460, 140));

        buttonRegister.setBackground(new java.awt.Color(0, 102, 102));
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setText("Registrar");
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 220, 45));

        txtCadDay.setBackground(new java.awt.Color(102, 153, 255));
        txtCadDay.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadDay.setForeground(new java.awt.Color(255, 255, 255));
        txtCadDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCadDay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCadDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 210, 30));

        labelDay.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelDay.setForeground(new java.awt.Color(255, 255, 255));
        labelDay.setText("Día");
        jPanel1.add(labelDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        labelMonth.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelMonth.setForeground(new java.awt.Color(255, 255, 255));
        labelMonth.setText("Mes");
        jPanel1.add(labelMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        txtCadMonth.setBackground(new java.awt.Color(102, 153, 255));
        txtCadMonth.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadMonth.setForeground(new java.awt.Color(255, 255, 255));
        txtCadMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCadMonth.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCadMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 210, 30));

        txtCadYear.setBackground(new java.awt.Color(102, 153, 255));
        txtCadYear.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtCadYear.setForeground(new java.awt.Color(255, 255, 255));
        txtCadYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCadYear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCadYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 210, 30));

        labelYear.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        labelYear.setForeground(new java.awt.Color(255, 255, 255));
        labelYear.setText("Año");
        jPanel1.add(labelYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

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
        jPanel1.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 40, 40));

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
        jPanel1.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 40));

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
        jPanel1.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 60));
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 630));

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
     * Detected change of the selection in comboType
     * @param evt Arg of the method implement
     */
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

    /**
     * <h1>Compiler data and send to controller for the register</h1>
     *
     * @param evt
     */
    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed

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
        String code;

        // Valid values null in the register        
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
            code = CodesProducts.generate(indexCode);
        }
        // Register product of type Expired
        if (band && (indexType == 0)) {

            // Create a new product with data input for user
            Product p = new Expired(year + "-" + month + "-" + day, name, code,
                    marca, model, Double.parseDouble(price),
                    description, Integer.parseInt(existence),
                    new User(name, code, day, WIDTH,
                            band, name, WIDTH, 'M'));

            // Execute query and catch result
            if (controller.registerProduct(p)) {
                setBackgroundToTxt(true);
                products.add(p);
                MainMenu.products.add(p);
                JOptionPane.showMessageDialog(null, 
                        "Registrado", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null,
                        "Error en base de datos\nConsulte al desarrollador", "Aviso",
                        JOptionPane.ERROR_MESSAGE);
            }

            // Register product of type NotExpired
        } else if (band) {

            Product p = new NotExpired(name, code, marca, model,
                    Double.parseDouble(price), description,
                    Integer.parseInt(existence), new User(
                    name, code, day, WIDTH,
                    band, name, WIDTH, 'M'));

            if (controller.registerProduct(p)) {
                
                setBackgroundToTxt(false);
                products.add(p);
                MainMenu.products.add(p);
                JOptionPane.showMessageDialog(null, 
                        "Registrado", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Error en base de datos\nConsulte al desarrollador", "Aviso",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonRegisterActionPerformed

    /**
     * Set background green to jTextField
     * @param type
     */
    private void setBackgroundToTxt(boolean type) {
       
        // Compare if change fileds for date expired
        if (type) {
            this.txtCadDay.setBackground(Color.GREEN);
            this.txtCadMonth.setBackground(Color.GREEN);
            this.txtCadYear.setBackground(Color.GREEN);

            this.txtCadDay.setForeground(Color.BLACK);
            this.txtCadMonth.setForeground(Color.BLACK);
            this.txtCadYear.setForeground(Color.BLACK);
        }
        
        this.txtCode.setBackground(Color.GREEN);
        this.txtDescription.setBackground(Color.GREEN);
        this.txtExist.setBackground(Color.GREEN);
        this.txtMarca.setBackground(Color.GREEN);
        this.txtModelo.setBackground(Color.GREEN);
        this.txtName.setBackground(Color.GREEN);
        this.txtPrice.setBackground(Color.GREEN);
        this.comboType.setBackground(Color.GREEN);

        this.txtCode.setForeground(Color.BLACK);
        this.txtDescription.setForeground(Color.BLACK);
        this.txtExist.setForeground(Color.BLACK);
        this.txtMarca.setForeground(Color.BLACK);
        this.txtModelo.setForeground(Color.BLACK);
        this.txtName.setForeground(Color.BLACK);
        this.txtPrice.setForeground(Color.BLACK);
        this.comboType.setForeground(Color.BLACK);
    }

    /**
     * Active o disable the editable propertie of the filed for the code
     * @param evt 
     */
    private void checkCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkCodeItemStateChanged
        txtCode.setEditable(!checkCode.isSelected());
    }//GEN-LAST:event_checkCodeItemStateChanged

    /**
     * Exited of the program
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
    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setForeground(Color.white);
    }//GEN-LAST:event_buttonMinMouseExited

    /**
     * Minimize this frame
     * @param evt
     */
    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    /**
     * Returned to main menu
     * @param evt 
     */
    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new RegisterProduct().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JCheckBox checkCode;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDay;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelExistence;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelMonth;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelYear;
    private javax.swing.JScrollPane scrollTxtArea;
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
