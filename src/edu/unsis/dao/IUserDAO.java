package edu.unsis.dao;

import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

/**
 *
 * @author elietzer
 */
public interface IUserDAO extends CRUD <User>{
    
    public boolean acces(Credentials credentials, User user);
    
}
