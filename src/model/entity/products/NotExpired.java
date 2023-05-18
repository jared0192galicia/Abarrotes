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
    public NotExpired(String name, String type, String code, int price,
            String description) {
        super(name, type, code, price, description);
    }
    
}
