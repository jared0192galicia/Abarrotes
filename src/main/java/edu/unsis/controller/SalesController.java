package edu.unsis.controller;

import edu.unsis.model.IProductModel;
import edu.unsis.model.ISaleModel;
import edu.unsis.model.ProductModelImpl;
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
    IProductModel modelProduct = new ProductModelImpl();
    
    public void generateReport(ArrayList<Product> products, Sale sale, String root) {
        model.createReport(products, sale, root);
    }

    public void registerSale(ArrayList<Product> productsSelected, Sale sale) {
        
        int count = 0;
        
        for (Product p : productsSelected) {
            for (Product pr : productsSelected) {
                if (p.getCode().equals(pr.getCode())) {
                    count++;
                }
            }
            p.setExistencia(p.getExistencia()-count);
            modelProduct.update(p);
            count = 0;
        }
        
        model.createRegister(sale);
    }
}
