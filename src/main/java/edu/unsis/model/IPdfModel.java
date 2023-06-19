package edu.unsis.model;

import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.Sale;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public interface IPdfModel {

    /**
     * Create an report with products and user sales
     * @param products products in the sale
     * @param sale for register
     * @param root For save pdf
     */
    public void createReport(ArrayList<Product> products, Sale sale ,String root);
            
    
    public void createRegister(ArrayList<Product> products, String root, double total);
}
