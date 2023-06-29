/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25/ jun /2023
 * modificado 29 / jun / 2023
 * Descripcion: Controlador entre view y model
 */
package edu.unsis.controller;

import edu.unsis.model.IProductModel;
import edu.unsis.model.ISaleModel;
import edu.unsis.model.ProductModelImpl;
import edu.unsis.model.SaleModelImpl;
import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.Sale;
import java.util.ArrayList;

public class SalesController {
    
    private final ISaleModel model = new SaleModelImpl();
    private final IProductModel modelProduct = new ProductModelImpl();
    
    /**
     * call to mode for create new report
     * @param products
     * @param sale
     * @param root 
     */
    public void generateReport(ArrayList<Product> products, Sale sale, String root) {
        model.createReport(products, sale, root);
    }

    /**
     * Register a sale and update products
     * @param productsSelected
     * @param sale 
     */
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
