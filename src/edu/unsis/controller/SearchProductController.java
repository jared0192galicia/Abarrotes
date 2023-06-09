/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 5/ jun /2023
 * modificado 5 / jun / 2023
 * Descripcion: Controlador entre view y model
 */
package edu.unsis.controller;

import edu.unsis.model.IProductModel;
import edu.unsis.model.ProductModelImpl;
import edu.unsis.model.entity.Product;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labtecweb10
 */
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
     * Fill model with data from database
     * @param model 
     */
    public boolean update(Product product) {
        return this.model.update(product);
    }
    
    public boolean delete(Product product) {
        return this.model.delete(product);
    }
}
