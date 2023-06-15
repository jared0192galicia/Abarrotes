package edu.unsis.model;

import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.User;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public interface IPdfModel {

    /**
     * Create an report with products and user sales
     * @param products products in the sale
     * @param user user vendedor
     * @param root For save pdf
     */
    public void createReport(ArrayList<Product> products, String root, String total);
            
}
