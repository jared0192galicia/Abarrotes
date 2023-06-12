/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Implememtacion del modelo para productos
 */
package edu.unsis.model;

import edu.unsis.dao.CRUD;
import edu.unsis.dao.ProductDAOImpl;
import edu.unsis.model.entity.Product;
import edu.unsis.view.MainMenu;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ProductModelImpl implements IProductModel {

    CRUD dao = new ProductDAOImpl();
    private static ArrayList<Product> products;

    /**
     * Proces load data of type T from data base (MySql)
     *
     * @return ArrayList with data
     */
    @Override
    public ArrayList<Product> listAll() {
        ProductModelImpl.products = dao.listAll();
        return products;
    }

    /**
     * Call metohod register product in cape DAO
     *
     * @param obj
     * @return false in case of error or true otherwise
     */
    @Override
    public boolean register(Product obj) {
        return dao.create(obj);
    }

    /**
     * Delete obj of type T in data base
     *
     * @param obj to delete in data base
     * @return false in case of error or true otherwise
     */
    @Override
    public boolean delete(Product obj) {
        return dao.delete(obj);
    }

    /**
     * Update the object, your primary key should be the same
     *
     * @param obj to the update
     * @return false in case of the error or true otherwise
     */
    @Override
    public boolean update(Product obj) {
        obj.setUpdateFor(UserModelImpl.getLoggedUser());
        return dao.update(obj);
    }

    /**
     * Fill model wirh data in products from MainMenu
     *
     * @param model
     */
    @Override
    public void showAll(DefaultTableModel model) {
        model.setNumRows(0);
        model.setColumnCount(0);
        model.addColumn("Nombre");
        model.addColumn("Codigo");
        model.addColumn("Modelo");
        model.addColumn("Existencia");
        model.addColumn("Precio");

        String row[];

        for (Product product : MainMenu.products) {
            row = new String[5];

            row[0] = product.getName();
            row[1] = product.getCode();
            row[2] = product.getModelo();
            row[3] = String.valueOf(product.getExistencia());
            row[4] = String.valueOf(product.getPrice());

            model.addRow(row);
        }
    }
}
