package model.entity.products;

import model.entity.User;

public class NotExpired extends Product {

    public NotExpired() {
    }

    /**
     * @param name
     * @param type
     * @param code
     * @param price
     * @param description 
     */
    public NotExpired(String name, String code, double price,
            String description) {
        super(name, code, price, description);
    }

    /**
     * @param name
     * @param code
     * @param Marca
     * @param Modelo
     * @param price
     * @param description
     * @param existencia
     * @param registerFor 
     */
    public NotExpired(String name, String code, String Marca, String Modelo, 
            double price, String description, int existencia, User registerFor) {
        super(name, code, Marca, Modelo, price, description, existencia, registerFor);
    }

    @Override
    public String getExpired() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
