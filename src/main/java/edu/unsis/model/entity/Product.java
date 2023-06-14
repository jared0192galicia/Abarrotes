package edu.unsis.model.entity;

public abstract class Product {

    private String name;
    private String code;
    private String Marca;
    private String Modelo;
    private double price;
    private String description;
    private int existencia;
    private User registerFor;
    private User updateFor;

    public Product() {}

    /**
     * @param name
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
    public Product(String name, String code, String Marca, String Modelo,
            double price, String description, int existencia, User registerFor) {
        this.name = name;
        this.code = code;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.price = price;
        this.description = description;
        this.existencia = existencia;
        this.registerFor = registerFor;
    }

    
    public abstract String getExpired();

    /**
     * Compare if this and p are the same
     * @param p obj for compare
     * @return true if are same and false in otherwise
     */
    public abstract boolean compareTo(Product p);
    
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

    public User getRegisterFor() {
        return registerFor;
    }

    public String getNameRegisterFor() {
        return registerFor.getUserName();
    }

    public void setRegisterFor(User registerFor) {
        this.registerFor = registerFor;
    }

    public User getUpdateFor() {
        return updateFor;
    }

    public String getNameUpdateFor() {
        return updateFor.getUserName();
    }

    public void setUpdateFor(User updateFor) {
        this.updateFor = updateFor;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", code=" + code + ", Marca="
                + Marca + " Modelo=" + Modelo + ", price=" + price
                + ",\n description=" + description + ", existencia=" + existencia
                + ", registerFor=" + registerFor + ", updateFor=" + updateFor 
                + '}';
    }
}
