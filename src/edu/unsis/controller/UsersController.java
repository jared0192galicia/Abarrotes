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
    
    public ArrayList<User> listAllUsers() {
        return model.listAll();
    }

    public boolean create(User u) {
        return model.create(u);
    }
}
