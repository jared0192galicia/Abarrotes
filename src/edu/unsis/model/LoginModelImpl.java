package edu.unsis.model;

import edu.unsis.dao.IUserDAO;
import edu.unsis.dao.UserDAOImpl;
import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

/**
 *
 * @author elietzer
 */
public class LoginModelImpl implements ILoginModel {
    
    private IUserDAO dao = new UserDAOImpl();
    private User currentUser;
    
    @Override
    public boolean getMatch(Credentials credentials, User user) {
        this.currentUser = user;
        return dao.acces(credentials, user);
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
    
    
}
