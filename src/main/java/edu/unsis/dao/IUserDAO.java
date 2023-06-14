/**
 * Autor: Galicia Cordova Elietzer Jared
 * Creado el: 25 / May / 2023
 * modificado: 11 / Jun / 2023
 * Descipciòn: Interfaz del CRUD basico para Usuarios 
 */
package edu.unsis.dao;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

public interface IUserDAO extends CRUD<User> {

    /**
     * Search match in data base of users with the data in credentials
     *
     * @param credentials data of the acces
     * @param user Obj for load data of the user found
     * @return false in case of the error or true otherwise
     */
    public boolean acces(Credentials credentials, User user);

    /**
     * Search a match with email in data base
     * @param email email for search 
     * @return false in case of error or true otherwise
     */
    public boolean search(String email);
}
