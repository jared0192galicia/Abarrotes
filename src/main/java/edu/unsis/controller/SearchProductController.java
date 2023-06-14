/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 5/ jun /2023
 * modificado 11 / jun / 2023
 * Descripcion: Controlador entre view y model
 */
package edu.unsis.controller;

import edu.unsis.model.IProductModel;
import edu.unsis.model.ProductModelImpl;
import edu.unsis.model.entity.Product;
import javax.swing.table.DefaultTableModel;

public class SearchProductController {
    
    IProductModel model = new ProductModelImpl();
    
    /**
     * Fill model with data from database
     * @param model 
     */
    public void showProducts(DefaultTableModel model) {
        this.model.showAll(model);
    }
    
    /**
     * Call cape model for updated
     * @param product product to updated
     * @return false in case of error or true otherwise
     */
    public boolean update(Product product) {
        return this.model.update(product);
    }
    
    /**
     * Call cape model for deleted product
     * @param product product to deleted
     * @return false in case of error or true otherwise
     */
    public boolean delete(Product product) {
        return this.model.delete(product);
    }
}
