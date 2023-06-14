/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Interfaz del modelo para la ventana Login
 */
package edu.unsis.model;

import edu.unsis.model.entity.User;
import java.util.ArrayList;

public interface IUserModel {

    /**
     * Call to cape DAO for returned list with all users in arrayList 
     * @return All users in ArrayList
     */
    public ArrayList<User> listAll();

    /**
     * Call to cape DAO for create new row in database.
     * @param u user to register
     * @return true if successful and false otherwise
     */
    public boolean create(User u);

    /**
     * Call to cape DAO for delete row in database.
     * @param user user to delete
     * @return true if successful and false otherwise
     */
    public boolean delete(User user);

    /**
     * Call to cape DAO for update row in database. 
     * @param u user to update
     * @return true if successful and false otherwise
     */
    public boolean update(User u);
    
    /**
     * Update pasword of the user with emial
     * @param email email for search user
     * @param pass new pasword for user
     * @return false in case of error or true otherwise
     */
    public boolean update(String email, String pass);
            
    /**
     * Search math in data base with data in credentials, and fill data for user 
     * @param email email for search 
     * @return false in case of error or true otherwise
     */
    public boolean search(String email);
}
