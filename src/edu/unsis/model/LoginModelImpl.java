/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Implememtacion del modelo para ventana Login
 */
package edu.unsis.model;

import edu.unsis.dao.IUserDAO;
import edu.unsis.dao.UserDAOImpl;
import edu.unsis.model.entity.Credentials;
import edu.unsis.model.entity.User;

public class LoginModelImpl implements ILoginModel {

    private final IUserDAO dao = new UserDAOImpl();

    /**
     * Search math in data base with data in credentials, and fill data for user
     * @param credentials credentials of the acces for login
     * @param user Object for fill data 
     * @return false in case of error or true otherwise
     */
    @Override
    public boolean search(Credentials credentials, User user) {
        dao.acces(credentials, user);
        
        UserModelImpl.setLoggedUser(user);

        if (user.getName() != null) {
            return user.getPassword().equals(credentials.getPassword());

        } else {
            return false;
        }
    }
}
