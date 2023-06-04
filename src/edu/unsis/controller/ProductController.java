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
    
    public boolean registerProduct(Product product) {
        return model.register(product);
    }
}
