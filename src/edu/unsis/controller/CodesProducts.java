package edu.unsis.controller;

import edu.unsis.view.MainMenu;
import java.util.ArrayList;
import javax.management.timer.Timer;
import model.entity.products.Product;

public class CodesProducts {
    
     private ArrayList<Product> products = MainMenu.products;
     
    
    
    public static String generate(boolean type) {
        String code = "";
        
        // 
        if (type) {
            code += "ALIM";
        } else {
            code += "LIMP";
        }
        
        code += "2023";
        
        return code;
    }
}
