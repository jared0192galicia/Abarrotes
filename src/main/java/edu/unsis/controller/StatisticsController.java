/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 19 / Jun / 2023
 * modificado: 19 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.controller;

import edu.unsis.model.ISaleModel;
import edu.unsis.model.SaleModelImpl;
import edu.unsis.model.entity.Sale;
import java.util.ArrayList;

public class StatisticsController {

    private final ISaleModel model = new SaleModelImpl();
    
    /**
     * List all sales
     * @return all sales
     */
    public ArrayList<Sale> load() {
        return model.listAll();
    }
    
}
