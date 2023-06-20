/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 19 / Jun / 2023
 * modificado: 19 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.model;

import edu.unsis.model.entity.Sale;
import java.util.ArrayList;

public interface ISaleModel {
    public ArrayList<Sale> listAll();
    
    public boolean createRegister(Sale sale);
    
    public boolean updateRegister(Sale sale, String code);
    
    public boolean deleteRegister(String code);
}
