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

    private final IUserDAO dao = new UserDAOImpl();

    @Override
    public boolean search(Credentials credentials, User user) {
        dao.acces(credentials, user);
        
        UserModelImpl.setLoggedUser(user);

        System.out.println(user.toString());
        if (user.getName() != null) {
            return user.getPassword().equals(credentials.getPassword());

        } else {
            return false;

        }

    }


}
