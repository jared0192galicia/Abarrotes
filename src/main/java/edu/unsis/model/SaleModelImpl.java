/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 19 / Jun / 2023
 * modificado: 19 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.model;

import edu.unsis.dao.CRUD;
import edu.unsis.dao.SaleDAOImpl;
import edu.unsis.model.entity.Sale;
import java.util.ArrayList;

public class SaleModelImpl implements ISaleModel {

    private final CRUD dao = new SaleDAOImpl();

    @Override
    public ArrayList<Sale> listAll() {
        return dao.listAll();
    }

    @Override
    public boolean createRegister(Sale sale) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateRegister(Sale sale, String code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteRegister(String code) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
