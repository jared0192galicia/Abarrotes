package edu.unsis.controller;

import edu.unsis.model.IPdfModel;
import edu.unsis.model.PdfModelImpl;
import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.User;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class SalesController {
    
    IPdfModel model = new PdfModelImpl();
    
    public void generateReport(ArrayList<Product> products, String root, String total) {
        model.createReport(products, root, total);
    }
}
