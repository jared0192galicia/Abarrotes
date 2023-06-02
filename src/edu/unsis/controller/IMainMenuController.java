package edu.unsis.controller;

import edu.unsis.model.entity.Product;
import java.util.ArrayList;

public interface IMainMenuController {
    
    /**
     * Method for load products from database and save in ArrayList
     * @return ArrayList with data
     */
    public ArrayList<Product> getData(); 
}
