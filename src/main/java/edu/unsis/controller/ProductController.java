/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 27 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Implememtacion del modelo para ventana Login
 */
package edu.unsis.controller;

import edu.unsis.model.IProductModel;
import edu.unsis.model.ProductModelImpl;
import edu.unsis.model.entity.Product;

public class ProductController {
    private final IProductModel model = new ProductModelImpl();
    
    /**
     * Call method register from cape model
     * @param product to register
     * @return false if exist error or true otherwise
     */ 
    public boolean registerProduct(Product product) {
        return model.register(product);
    }
}
