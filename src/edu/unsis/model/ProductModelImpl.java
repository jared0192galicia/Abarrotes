
package edu.unsis.model;

import edu.unsis.dao.IProductDAO;
import edu.unsis.dao.ProductDAOImpl;
import edu.unsis.model.entity.Product;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class ProductModelImpl implements IProductModel {

    IProductDAO dao = new ProductDAOImpl();
    
    @Override
    public ArrayList<Product> listAll() {
        return dao.listAll();
    }

    @Override
    public boolean register(Product obj) {
        return dao.create(obj);
    }

    @Override
    public boolean delete(Product obj) {
        return dao.delete(obj);
    }

    @Override
    public boolean update(Product obj) {
        return dao.update(obj);
    }
    
}
