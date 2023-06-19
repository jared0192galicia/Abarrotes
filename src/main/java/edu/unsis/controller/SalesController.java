package edu.unsis.controller;

import edu.unsis.model.IPdfModel;
import edu.unsis.model.PdfModelImpl;
import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.Sale;
import edu.unsis.model.entity.User;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author elietzer
 */
public class SalesController {
    
    IPdfModel model = new PdfModelImpl();
    
    public void createSale(ArrayList<Product> products, String root, double total) {
        model.createRegister(products, root, total);
    }
    
    public void generateReport(ArrayList<Product> products, Sale sale, String root) {
        model.createReport(products, sale, root);
    }
}
