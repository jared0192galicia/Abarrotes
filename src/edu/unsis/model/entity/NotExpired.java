package edu.unsis.model.entity;

public class NotExpired extends Product {

    public NotExpired() {
    }

    /**
     * @param name
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
        return "";
    }

    @Override
    public boolean compareTo(Product p) {
        return p.toString().equals(this.toString());
    }

}
