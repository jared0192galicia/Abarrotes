package edu.unsis.dao;

import edu.unsis.model.entity.Expired;
import edu.unsis.model.entity.NotExpired;
import edu.unsis.model.entity.Product;
import edu.unsis.utilities.ConexionImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class ProductDAOImpl implements IProductDAO {

    ArrayList<Product> products;

    /**
     * List all products from data base
     *
     * @return ArrayList with all products
     */
    @Override
    public ArrayList<Product> listAll() {
        products = new ArrayList<>();

        Connection cn = ConexionImpl.getConnction();

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
     *
     * @param obj Obj to be register in data base
     * @return false in case of the error or true otherwise
     */
    @Override
    public boolean create(Product obj) {
        System.out.println("1");
        // Get connection with mysql
        Connection cn = ConexionImpl.getConnction();
        PreparedStatement pst;
        boolean type = true;
        try {
            // true: type not expired
//            if (type) {
//            pst = cn.prepareStatement(
//                    "INSERT INTO products (codes, namep, model, marca, price, "
//                    + "existence, descrip, registerFor) VALUES "
//                    + "(?, ? ,?, ?, ? ,?, ?, ?);");

//            } else {
            Expired pr = (Expired) obj;

            pst = cn.prepareStatement(
                    "INSERT INTO products (codes, namep, model, marca, price, "
                    + "existence, descrip, dateExpiry, registerFor) VALUES "
                    + "(?, ? ,?, ?, ? ,?, ?, ?, ?);");

            pst.setString(8, pr.getDate());
            pst.setString(9, obj.getNameRegisterFor());
//            }

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

    @Override
    public boolean delete(Product obj) {
        Connection cn = ConexionImpl.getConnction();
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

    @Override
    public boolean update(Product obj) {
        PreparedStatement pst;

        Connection cn = ConexionImpl.getConnction();

        try {

            pst = cn.prepareStatement(
                    "UPDATE products SET nameP = ?, model = ?, marca = ?, "
                    + "price = ?, existence = ?, descrip = ?, "
                    + "dateExpiry = ?, updateFor = ? where codes = '"
                    + obj.getCode() + "'");
            
            pst.setString(1, obj.getName());
            pst.setString(2, obj.getModelo());
            pst.setString(3, obj.getMarca());
            pst.setDouble(4, obj.getPrice());
            pst.setInt(5, obj.getExistencia());
            pst.setString(6, obj.getDescription());
            pst.setString(7, obj.getExpired());
            pst.setString(8, obj.getNameUpdateFor());
            
            pst.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error en update \n" + e.getMessage());
        }

        return true;
    }

}
