/**
 * Autor jared
 * Creado el: 19 / 06 / 2023
 */
package edu.unsis.dao;

import edu.unsis.model.entity.Sale;
import edu.unsis.utilities.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SaleDAOImpl implements CRUD<Sale> {

    /**
     * List all sales from data base
     *
     * @return ArrayList with all sales
     */
    @Override
    public ArrayList<Sale> listAll() {
        ArrayList<Sale> sales = new ArrayList<>();

        Connection cn = Conexion.getConnction();
        PreparedStatement pst;

        try {
            pst = cn.prepareStatement("SELECT * FROM sale");
            ResultSet rs = pst.executeQuery();

            Sale sale;
            while (rs.next()) {
                sale = new Sale();
                sale.setCode(rs.getString("codeS"));
                sale.setCodesProducts(rs.getString("codesPr"));
                sale.setDate(rs.getString("dateS"));
                sale.setIncome(rs.getDouble("income"));
                sale.setSaleFor(rs.getString("userName"));

                sales.add(sale);
            }
        } catch (SQLException e) {
        }

        return sales;
    }

    /**
     * Create a new row with sale
     *
     * @param obj Sale for register
     * @return
     */
    @Override
    public boolean create(Sale obj) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;

        try {
            pst = cn.prepareStatement("INSERT INTO sale VALUES (?, ?, ?, ?, ?)");

            pst.setString(1, obj.getCode());
            pst.setString(2, obj.getDate());
            pst.setDouble(3, obj.getIncome());
            pst.setString(4, obj.getSaleFor());
            pst.setString(5, obj.getCodesProducts());

            pst.executeUpdate();

        } catch (SQLException e) {
            return false;
        }

        return true;
    }

    /**
     * Delete regiter obj from database if exist
     *
     * @param obj Product to delete
     * @return true in case of the succefful or true otherwise
     */
    @Override
    public boolean delete(Sale obj) {
        Connection cn = Conexion.getConnction();
        PreparedStatement pst;

        try {
            pst = cn.prepareStatement(
                    "DELETE FROM sale WHERE codeS = '"
                    + obj.getCode() + "'");

            pst.executeUpdate();
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    /***
     * Sale is not updated
     * @param obj
     * @return 
     */
    @Override
    public boolean update(Sale obj) {
        throw new UnsupportedOperationException("Una venta no se puede modificar."); 
    }

}
