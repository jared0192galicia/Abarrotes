package edu.unsis.dao;



import java.util.ArrayList;

public interface CRUD <T> {
    
    /**
     * Proces load data of type T from data base (MySql)
     * @return ArrayList with data
     */
    public ArrayList<T> listAll();
    
    /**
     * Register the obj of type T in database
     * @param obj to resgister in the data base
     * @return false in case of the error
     */
    public boolean create(T obj);
    
    /**
     * Delete obj of type T in data base
     * @param obj to delete in data base
     * @return false in case of error or true otherwise
     */
    public boolean delete(T obj);
    
    /**
     * Update the object, your primary key should be the same
     * @param obj to the update
     * @return false in case of the error or true otherwise
     */
    public boolean update(T obj);
}
