package edu.unsis.controller;

import edu.unsis.model.ISaleModel;
import edu.unsis.model.SaleModelImpl;
import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.Sale;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class SalesController {
    
    ISaleModel model = new SaleModelImpl();
    
//    public void createSale(ArrayList<Product> products, String root, double total) {
//        model.createRegister(products, root, total);
//    }
    
    public void generateReport(ArrayList<Product> products, Sale sale, String root) {
        model.createReport(products, sale, root);
    }

    public void registerSale(Sale sale) {
    }
}
