package edu.unsis.controller;

import edu.unsis.model.ILoginModel;
import edu.unsis.model.LoginModelImpl;
import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

public class LoginControllerImpl implements ILoginController {

    // Obj for connect the view with model
    private ILoginModel model = new LoginModelImpl();
    
    /**
     * Implementation of the interface ILoginController. Mehtod get Match
     * @param credentials Data input for user
     * @param user Obj for load data from data base. is null if not exist match
     * @return false in case of error
     */
    @Override
    public boolean getMatch(Credentials credentials, User user) {
        return model.search(credentials, user);
    }
    
}
