/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 19/may/2023
 * modificado 22/may/2023
 * Descripcion: Metodos de conexion con mysql
 */

package service.implementation;

import service.implementation.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entity.User;
import model.entity.products.Expired;
import model.entity.products.NotExpired;
import model.entity.products.Product;

public class Data {

    /**
     * @return ArrayList with the products getter of mysql
     */
    public static ArrayList<Product> load() {
        ArrayList<Product> products = new ArrayList<>();

        Connection cn = Conexion.getConnction();

        try {
            PreparedStatement pst = cn.prepareStatement(
                    "SELECT * FROM products");

            ResultSet rs = pst.executeQuery();

            Product p;
            String aux;
            
            /**
             * Save data from object ResultSet
             */
            while (rs.next()) {
                aux = rs.getString("dateExpiry");

                if (aux == null) {
                    p = new NotExpired();
                } else {

                    p = new Expired(aux);

                }

                p.setCode(rs.getString("codes"));
                p.setDescription(rs.getString("descrip"));
                p.setExistencia(Integer.parseInt(rs.getString(
                        "existence")));
                p.setMarca(rs.getString("marca"));
                p.setModelo(rs.getString("model"));
                p.setName(rs.getString("namep"));
                p.setPrice(Double.parseDouble(rs.getString(
                        "price")));

                products.add(p);
            }
        } catch (NumberFormatException | SQLException e) {
            System.err.println("Error in register\n\n" + e.getMessage());
        }
        
        System.out.println("End load data");
        return products;
    }

    /**
     * Create new row in sql with data of the object Product
     * @param p object row
     * @param type
     *  @value true {NotExpired}
     *  @value False {Expired}
     * @return boolean for catch error in register
     */
    public boolean create(Product p, boolean type) {
        
        System.out.println("1");
        // Get connection with mysql
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;
        try {
            // true: type not expired
            if (type) {
                pst = cn.prepareStatement(
                        "INSERT INTO products (codes, namep, model, marca, price, "
                        + "existence, descrip, registerFor) VALUES "
                        + "(?, ? ,?, ?, ? ,?, ?, ?);");

                pst.setString(8, p.getNameRegisterFor());
            } else {

                Expired pr = (Expired) p;

                pst = cn.prepareStatement(
                        "INSERT INTO products (codes, namep, model, marca, price, "
                        + "existence, descrip, dateExpiry, registerFor) VALUES "
                        + "(?, ? ,?, ?, ? ,?, ?, ?, ?);");

                pst.setString(8, pr.getDate());
                pst.setString(9, p.getNameRegisterFor());
            }

            System.out.println("2");
            pst.setString(1, p.getCode());
            pst.setString(2, p.getName());
            pst.setString(3, p.getModelo());
            pst.setString(4, p.getMarca());
            pst.setString(5, String.valueOf(p.getPrice()));
            pst.setString(6, String.valueOf(p.getExistencia()));
            pst.setString(7, p.getDescription());

            System.out.println("3");
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error in register\n\n" + e.getMessage());
            return false;

        }
        
        return true;
    }

    /**
     * @param user to register in table user of mysql with information
     * the object user
     */
    public void createUser(User user) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;
        System.out.println("in method");
        
        String aux = "0";
        if (user.isStatus()) {
            aux = "1";
        }
        
        
        try {
            pst = cn.prepareStatement(
                    "INSERT INTO users VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?)");

            // Set data to query
            pst.setString(1, user.getUserName());
            pst.setString(2, user.getPassword());
            pst.setString(3, user.getEmail());
            pst.setString(4, user.getName());
            pst.setString(5, aux);
            pst.setString(6, String.valueOf(user.getEdad()));
            pst.setString(7, String.valueOf(user.getSexo()));
            pst.setString(8, String.valueOf(user.getLevel()));
            
            pst.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Error in register user" + e.getMessage());
        }
    }
}