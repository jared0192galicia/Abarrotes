package edu.unsis.controller;

import edu.unsis.model.IProductModel;
import edu.unsis.model.ProductModelImpl;
import edu.unsis.model.entity.Product;

/**
 *
 * @author elietzer
 */
public class ProductController {
    IProductModel model = new ProductModelImpl();
    
    /**
     * Call method register from cape model
     * @param product to register
     * @return false if exist error or true otherwise
     */ 
    public boolean registerProduct(Product product) {
        return model.register(product);
    }
}
