package edu.unsis.controller;

import edu.unsis.model.ILoginModel;
import edu.unsis.model.LoginModelImpl;
import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

public class LoginControllerImpl implements ILoginController {

    private ILoginModel model = new LoginModelImpl();
    
    @Override
    public boolean getMatch(Credentials credentials, User user) {
        return model.getMatch(credentials, user);
    }
    
}
