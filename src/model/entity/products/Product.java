package model.entity.products;

public class Product {
    
    private String name;
    private String type;
    private String code;
    private int price;
    private String description;
    public static int existencia;

    public Product() {}
    
    /**
     * @param name
     * @param type
     * @param code
     * @param price
     * @param description 
     */
    public Product(String name, String type, String code, int price, String description) {
        this.name = name;
        this.type = type;
        this.code = code;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int getExistencia() {
        return existencia;
    }

    public static void setExistencia(int existencia) {
        Product.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Poduct{" + "name=" + name + ", type=" + type + ", code=" + code + ", price=" + price + ", description=" + description + '}';
    }
    
}
