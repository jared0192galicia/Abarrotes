/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 25 / May / 2023
 * modificado: 11 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.dao;

import edu.unsis.model.entity.Expired;
import edu.unsis.model.entity.NotExpired;
import edu.unsis.model.entity.Product;
import edu.unsis.utilities.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements CRUD <Product> {

    ArrayList<Product> products;

    /**
     * List all products from data base
     * @return ArrayList with all products
     */
    @Override
    public ArrayList<Product> listAll() {
        products = new ArrayList<>();

        Connection cn = Conexion.getConnction();

        try {
            PreparedStatement pst = cn.prepareStatement(
                    "SELECT * FROM products");

            ResultSet rs = pst.executeQuery();

            Product p;
            String aux;

            /*
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
     * Create register in data base with data in obj
     * @param obj Obj to be register in data base
     * @return true in case of the succefful or true otherwise
     */
    @Override
    public boolean create(Product obj) {
        System.out.println("1");
        // Get connection with mysql
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;
        try {

            Expired pr = new Expired();
            try {
                pr = (Expired) obj;

            } catch (Exception e) {
                System.out.println("pr = " + pr.toString());
            }

            pst = cn.prepareStatement(
                    "INSERT INTO products (codes, namep, model, marca, price, "
                    + "existence, descrip, dateExpiry, registerFor) VALUES "
                    + "(?, ? ,?, ?, ? ,?, ?, ?, ?);");

            pst.setString(8, pr.getDate());
            pst.setString(9, obj.getNameRegisterFor());

            System.out.println("2");
            pst.setString(1, obj.getCode());
            pst.setString(2, obj.getName());
            pst.setString(3, obj.getModelo());
            pst.setString(4, obj.getMarca());
            pst.setString(5, String.valueOf(obj.getPrice()));
            pst.setString(6, String.valueOf(obj.getExistencia()));
            pst.setDouble(6, obj.getExistencia());
            System.out.println("DAO: Existencia: " + obj.getExistencia());
            pst.setString(7, obj.getDescription());

            System.out.println("3");
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error in register\n\n" + e.getMessage());
            return false;

        }

        return true;
    }

    /**
     * Delete regiter obj from database if exist
     * @param obj Product to delete
     * @return true in case of the succefful or true otherwise
     */
    @Override
    public boolean delete(Product obj) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;

        try {
            pst = cn.prepareStatement(
                    "DELETE FROM products WHERE codes='"
                    + obj.getCode() + "'");

            pst.executeUpdate();
            return true;

        } catch (SQLException e) {

            System.err.println("Error to delete\n" + e.getMessage());

            return false;
        }
    }

    /**
     * Update prudct obj from database
     * @param obj product to update
     * @return true in case of the succefful or true otherwise
     */
    @Override
    public boolean update(Product obj) {

        PreparedStatement pst;
        Connection cn = Conexion.getConnction();

        Expired p = new Expired();
        try {
            p = (Expired) obj;

        } catch (Exception e) {

            p.setCode(obj.getCode());
            p.setDescription(obj.getDescription());
            p.setExistencia(obj.getExistencia());
            p.setMarca(obj.getMarca());
            p.setModelo(obj.getModelo());
            p.setName(obj.getName());
            p.setPrice(obj.getPrice());
            p.setRegisterFor(obj.getRegisterFor());
            p.setUpdateFor(obj.getRegisterFor());
            System.out.println("p = " + p.toString());

        }
        try {

            pst = cn.prepareStatement(
                    "UPDATE products SET nameP = ?, model = ?, marca = ?, "
                    + "price = ?, existence = ?, descrip = ?, "
                    + "dateExpiry = ? where codes = '"
                    + obj.getCode() + "'");

            pst.setString(1, p.getName());
            pst.setString(2, p.getModelo());
            pst.setString(3, p.getMarca());
            pst.setDouble(4, p.getPrice());
            pst.setInt(5, p.getExistencia());
            pst.setString(6, p.getDescription());
            pst.setString(7, p.getExpired());

            pst.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error en update \n" + e.getMessage());
        }

        return true;
    }

}
