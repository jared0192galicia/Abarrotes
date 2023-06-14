/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 10 / Jun / 2023
 * modificado 22/may/2023
 * Descripcion: Controlar para el Frame de usuarios
 */
package edu.unsis.controller;

import edu.unsis.model.IUserModel;
import edu.unsis.model.UserModelImpl;
import edu.unsis.model.entity.User;
import java.util.ArrayList;

public class UsersController {
    
    IUserModel model = new UserModelImpl();
    
    /**
     * Call to listAll from cape model
     * @return Array List with all users
     */
    public ArrayList<User> listAllUsers() {
        return model.listAll();
    }

    /**
     * Call to create from cape model for create a new user
     * @param u User to register
     * @return false in case of error or true otherwise
     */
    public boolean create(User u) {
        return model.create(u);
    }

    /**
     * Call to delete from cape model for delete an user
     * @param user for update register
     * @return false in case of error or true otherwise
     */
    public boolean delete(User user) {
        return model.delete(user);
    }

    /**
     * Call to update from cape model for update a existing user
     * @param u User for update 
     * @return false in case of error or true otherwise
     */
    public boolean update(User u) {
        return model.update(u);
    }
}
