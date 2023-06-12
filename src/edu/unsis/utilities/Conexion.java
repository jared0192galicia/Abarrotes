/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 10 / may / 2023
 * modificado 11 / Jul / 2023
 * Descripcion: Login principal
 */
package edu.unsis.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection cn = null;
    
    /**
     * Method for generate code of product.
     * @return String code for alement
     */
    public static Connection getConnction() {

        if (cn == null) {

            String user = "root";
            String pass = "DMR003QP10·a";
            String root = "127.0.0.1";

            try {
                cn = DriverManager.getConnection(
                        "jdbc:mysql://" + root + "/abarrotes_db", user, pass);

            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, 
                        e.getMessage(), "MySql", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        return cn;
    }
    
    /**
     * Close conection with mysql
     * @throws SQLException 
     */
    public static void closeConnection() throws SQLException {
        if (cn != null) {
            cn.close();
        }
    }
}
