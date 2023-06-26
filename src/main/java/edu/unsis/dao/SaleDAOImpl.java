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
     * Crea una nueva venta en la base de datos2
     * @param obj
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

    @Override
    public boolean delete(Sale obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Sale obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
