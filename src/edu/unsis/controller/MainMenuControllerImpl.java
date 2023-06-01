package edu.unsis.controller;

import edu.unsis.model.IMainMenuModel;
import edu.unsis.model.MainMenuModelImpl;
import edu.unsis.model.entity.Product;
import java.util.ArrayList;

/**
 *
 * @author elietzer
 */
public class MainMenuControllerImpl implements IMainMenuController {

    IMainMenuModel model = new MainMenuModelImpl();
    
    @Override
    public ArrayList<Product> getData() {
        return model.loadProducts();
    }
    
}
