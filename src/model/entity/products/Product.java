package model.entity.products;

public abstract class Product {
    
    private String name;
    private String code;
    private String Marca;
    private String Modelo;
    private double price;
    private String description;
    public int existencia;

    public Product() {}
    
    /**
     * @param name
     * @param type
     * @param code
     * @param price
     * @param description 
     */
    public Product(String name, String code, double price, String description) {
        this.name = name;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", code=" + code + ", Marca=" +
                Marca + ", Modelo=" + Modelo + ", price=" + price + 
                ", description=" + description + ", existencia=" + 
                existencia + '}';
    }

    
    
}
