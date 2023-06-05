package edu.unsis.model;

import edu.unsis.model.entity.Product;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elietzer
 */
public interface IProductModel {
    
    
    
    /**
     * Proces load data of type T from data base (MySql)
     * @return ArrayList with data
     */
    public ArrayList<Product> listAll();
    
    /**
     * Proces load data of type T from data base (MySql)
     * @param model
     */
    public void showAll(DefaultTableModel model);
    
    /**
     * Call metohod register product in cape DAO
     * @param obj
     * @return 
     */
    public boolean register(Product obj);
    
    /**
     * Delete obj of type T in data base
     * @param obj to delete in data base
     * @return false in case of error or true otherwise
     */
    public boolean delete(Product obj);
    
    /**
     * Update the object, your primary key should be the same
     * @param obj to the update
     * @return false in case of the error or true otherwise
     */
    public boolean update(Product obj);
}
