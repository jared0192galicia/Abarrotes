package edu.unsis.model;

import edu.unsis.dao.IUserDAO;
import edu.unsis.dao.UserDAOImpl;
import edu.unsis.model.entity.User;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class UserModelImpl implements IUserModel {
    
    private static User loggedUser;
    private final IUserDAO dao = new UserDAOImpl();

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User loggedUser) {
        UserModelImpl.loggedUser = loggedUser;
    }

    @Override
    public ArrayList<User> listAll() {
        return dao.listAll();
    }

    @Override
    public boolean create(User u) {
        return dao.create(u);
    }
    
    
}
