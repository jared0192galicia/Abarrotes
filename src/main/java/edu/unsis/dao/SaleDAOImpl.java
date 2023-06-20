/**
 * Autor jared
 * Creado el: 19 / 06 / 2023
 */
package edu.unsis.dao;

import com.mysql.cj.protocol.Resultset;
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

    @Override
    public boolean create(Sale obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
