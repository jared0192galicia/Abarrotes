/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 25 / may / 2023
 * modificado 11 / Jun / 2023
 * Descripcion: Implememtacion del modelo para usuarios
 */
package edu.unsis.model;

import edu.unsis.dao.IUserDAO;
import edu.unsis.dao.UserDAOImpl;
import edu.unsis.model.entity.User;
import java.util.ArrayList;

public class UserModelImpl implements IUserModel {

    private static User loggedUser;
    private final IUserDAO dao = new UserDAOImpl();

    /**
     * Call to cape DAO for returned list with all users in arrayList
     *
     * @return All users in ArrayList
     */
    @Override
    public ArrayList<User> listAll() {
        return dao.listAll();
    }

    /**
     * Call to cape DAO for create new row in database.
     *
     * @param u user to register
     * @return true if successful and false otherwise
     */
    @Override
    public boolean create(User u) {
        return dao.create(u);
    }

    /**
     * Call to cape DAO for delete row in database.
     *
     * @param user user to delete
     * @return true if successful and false otherwise
     */
    @Override
    public boolean delete(User user) {
        return dao.delete(user);
    }

    /**
     * Call to cape DAO for update row in database.
     *
     * @param u user to update
     * @return true if successful and false otherwise
     */
    @Override
    public boolean update(User u) {
        return dao.update(u);
    }

    /**
     * Search math in data base with data in credentials, and fill data for user
     *
     * @param email email for search
     * @return false in case of error or true otherwise
     */
    @Override
    public boolean search(String email) {
        return dao.search(email);
    }
    
    /**
     * Update pasword of the user with emial
     * @param email email for search user
     * @param pass new pasword for user
     * @return false in case of error or true otherwise
     */
    @Override
    public boolean update(String email, String pass) {
        return dao.update(email, pass);
    }

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User loggedUser) {
        UserModelImpl.loggedUser = loggedUser;
    }

}
