package edu.unsis.controller;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

public interface ILoginController {

    /**
     * Search match in database with data in credentials
     * @param credentials of user for search match
     * @param user obj for load getting data
     * @return 
     */
    public boolean getMatch(Credentials credentials, User user);
    
}
