package edu.unsis.model;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

/**
 *
 * @author elietzer
 */
public interface ILoginModel {
    
    /**
     * Method for search user with data = credentials
     * @param credentials data of the acces
     * @param user Obj to load the data
     * @return status of the operation
     */
    public boolean getMatch(Credentials credentials, User user);
}
