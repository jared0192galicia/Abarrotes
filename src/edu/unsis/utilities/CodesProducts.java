/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 22/may/2023
 * modificado 11 / Jul / 2023
 * Descripcion: Genera caracteristicas para los productos
 */
package edu.unsis.utilities;

import edu.unsis.view.MainMenu;
import edu.unsis.model.entity.Product;

public class CodesProducts {

    private static final String letters[]
            = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "Z"};

    /**
     * Generate unique code for products expirate or not expirate
     * @param type true for expirate or false for not expirate
     * @return code unique generate
     */
    public static String generate(boolean type) {
        String code;
        boolean band;

        do {
            band = false;
            code = "";
            
            if (type) {
                code += "ALIM";
            } else {
                code += "LIMP";
            }

            code += "2023";
            int num;

            for (int i = 0; i < 3; i++) {
                num = (int) (Math.random() * 9);
                code += String.valueOf(num);
                code += letters[num];
            }

            for (Product product : MainMenu.products) {
                if (code.equals(product.getCode())) {
                    band = true;
                }
            }

        } while (band);
        
        return code;
    }
}
