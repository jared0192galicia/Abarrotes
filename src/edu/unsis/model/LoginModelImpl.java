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
    public boolean search(Credentials credentials, User user) {
        dao.acces(credentials, user);
        this.currentUser = user;

        System.out.println(user.toString());
        if (user.getName() != null) {
            return user.getPassword().equals(credentials.getPassword());

        } else {
            return false;

        }

    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

}
