package edu.unsis.model;

import edu.unsis.model.entity.User;

/**
 *
 * @author elietzer
 */
public class UserModelImpl implements IUserModel {
    private static User loggedUser;

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User loggedUser) {
        UserModelImpl.loggedUser = loggedUser;
    }
    
    
}
