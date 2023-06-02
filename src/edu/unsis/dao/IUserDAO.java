package edu.unsis.dao;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

/**
 *
 * @author elietzer
 */
public interface IUserDAO extends CRUD <User>{
    
    /**
     * Search math in data base of users with the data in credentials
     * @param credentials data of the acces
     * @param user Obj for load data of the user found
     * @return false in case of the error or true otherwise
     */
    public boolean acces(Credentials credentials, User user);
    
}
