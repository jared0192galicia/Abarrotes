/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 19 / Jun / 2023
 * modificado: 19 / Jun / 2023
 * Descipciòn: Implementacion del CRUD basico en mysql para productos
 */
package edu.unsis.model;

import edu.unsis.model.entity.Product;
import edu.unsis.model.entity.Sale;
import java.util.ArrayList;

public interface ISaleModel {

    /**
     * List all sales from data base
     *
     * @return All sales
     */
    public ArrayList<Sale> listAll();

    /**
     * Crea un registro en dao
     *
     * @param sale
     * @return
     */
    public boolean createRegister(Sale sale);

    /**
     * Update Sale in data base
     *
     * @param sale sale for updated
     * @param code key for search
     * @return
     */
    public boolean updateRegister(Sale sale, String code);

    /**
     * Delete sale from database
     *
     * @param code
     * @return
     */
    public boolean deleteRegister(String code);

    /**
     * Create an report with products and user sales
     *
     * @param products products in the sale
     * @param sale for register
     * @param root For save pdf
     */
    public void createReport(ArrayList<Product> products, Sale sale, String root);
}
