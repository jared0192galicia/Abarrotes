/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Implememtacion del modelo para ventana Login
 */
package edu.unsis.controller;

import edu.unsis.model.ILoginModel;
import edu.unsis.model.LoginModelImpl;
import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

public class LoginController {

    // Obj for connect the view with model
    private final ILoginModel model = new LoginModelImpl();
    
    /**
     * Implementation of the interface ILoginController. Mehtod get Match
     * @param credentials Data input for user
     * @param user Obj for load data from data base. is null if not exist match
     * @return false in case of error
     */
    public boolean getMatch(Credentials credentials, User user) {
        return model.search(credentials, user);
    }
    
}
