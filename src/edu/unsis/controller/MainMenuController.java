/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Implememtacion del modelo para ventana Login
 */
package edu.unsis.controller;

import edu.unsis.model.IProductModel;
import edu.unsis.model.ProductModelImpl;
import edu.unsis.model.entity.Product;
import java.util.ArrayList;

public class MainMenuController {

    IProductModel model = new ProductModelImpl();
    
    /**
     * Method of connection between view with model
     * @return ArrayList with products
     */
    public ArrayList<Product> getData() {
        return model.listAll();
    }
    
}
