package edu.unsis.controller;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

public interface ILoginController {

    public boolean getMatch(Credentials credentials, User user);
    
}
