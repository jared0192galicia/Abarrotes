package edu.unsis.model;

import edu.unsis.model.entity.User;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public interface IUserModel {

    public ArrayList<User> listAll();

    public boolean create(User u);

}
