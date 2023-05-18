package model.entity.products;

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
    
}
