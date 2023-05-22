package edu.unsis.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entity.products.Expired;
import model.entity.products.NotExpired;
import model.entity.products.Product;

public class Data {

    public static ArrayList<Product> load() {
        ArrayList<Product> products = new ArrayList<>();

        Connection cn = Conexion.getConnction();

        try {
            PreparedStatement pst = cn.prepareStatement(
                    "SELECT * FROM products");

            ResultSet rs = pst.executeQuery();

            Product p;
            String aux;
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

        for (Product product : products) {
            System.out.println(product.toString());
        }
        System.out.println("End load data");
        return products;
    }

    /**
     * @param p object row
     * @param type
     *  @value true {NotExpired}
     *  @value False {Expired}
     */
    public void create(Product p, boolean type) {

        // Get connection with mysql
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;
        System.out.println("1");
        try {
            // true: type not expired
            if (type) {
                pst = cn.prepareStatement(
                        "INSERT INTO products (codes, namep, model, marca, price, "
                        + "existence, descrip, registerFor) VALUES "
                        + "(?, ? ,?, ?, ? ,?, ?, ?);");
            } else {

                Expired pr = (Expired) p;

                pst = cn.prepareStatement(
                        "INSERT INTO products (codes, namep, model, marca, price, "
                        + "existence, descrip, dateExpiry, registerFor) VALUES "
                        + "(?, ? ,?, ?, ? ,?, ?, ?, ?);");
                
                pst.setString(7, pr.getDate());
            }

        System.out.println("2");
            pst.setString(0, p.getCode());
            pst.setString(1, p.getName());
            pst.setString(2, p.getModelo());
            pst.setString(3, p.getMarca());
            pst.setString(4, String.valueOf(p.getPrice()));
            pst.setString(5, String.valueOf(p.getExistencia()));
            pst.setString(6, p.getDescription());
            pst.setString(7, p.getNameRegisterFor());
            
            
        System.out.println("3");
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error in register\n\n" + e.getMessage());
            
        }
    }
}
