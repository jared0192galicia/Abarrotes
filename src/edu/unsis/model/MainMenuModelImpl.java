package edu.unsis.model;

import edu.unsis.dao.IProductDAO;
import edu.unsis.dao.ProductDAOImpl;
import edu.unsis.model.entity.Product;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class MainMenuModelImpl implements IMainMenuModel {

    IProductDAO dao = new ProductDAOImpl();
    
    @Override
    public ArrayList<Product> loadProducts() {
        return dao.listAll();
    }
    
}
