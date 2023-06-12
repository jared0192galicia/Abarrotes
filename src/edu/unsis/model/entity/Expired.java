package edu.unsis.model.entity;

public final class Expired extends Product {

    private String day;
    private String year;
    private String month;
    private String date;

    public Expired() {}
    
    /**
     * 
     * @param date 
     */
    public Expired(String date) {
        this.date = date;
    }

    /**
     * @param date
     * @param name
     * @param code
     * @param Marca
     * @param Modelo
     * @param price
     * @param description
     * @param existencia
     * @param registerFor 
     */
    public Expired(String date, String name, String code, String Marca,
            String Modelo, double price, String description, int existencia,
            User registerFor) {
        
        super(name, code, Marca, Modelo, price, description, existencia, registerFor);
        this.day = day;
        this.year = year;
        this.month = month;
        this.date = date;
    }

    /**
     * @param date
     * @param name
     * @param code
     * @param price
     * @param description 
     */
    public Expired(String date, String name, String code, double price, 
            String description) {
        super(name, code, price, description);
        this.day = day;
        this.year = year;
        this.month = month;
        this.date = date;
    }
    
    /**
     * @param name
     * @param code
     * @param price
     * @param description 
     */
    public Expired(String name, String code, double price, String 
            description) {
        super(name, code, price, description);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
    
    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Expired{" + "date=" + date + '}' + super.toString();
    }

    @Override
    public String getExpired() {
        return date;
    }

    /**
     * Compare if this and p are the same
     * @param p obj for compare
     * @return true if are same and false in otherwise
     */
    @Override
    public boolean compareTo(Product p) {
        
        if (!p.getCode().equals(this.getCode())) {
            return false;
        }
        if (!p.getDescription().equals(this.getDescription())) {
            return false;
        }
        if (p.getExistencia() != this.getExistencia()) {
            return false;
        }
        if (!p.getExpired().equals(this.getExpired())) {
            return false;
        }
        if (!p.getMarca().equals(this.getMarca())) {
            return false;
        }
        if (!p.getModelo().equals(this.getModelo())) {
            return false;
        }
        if (!p.getName().equals(this.getName())) {
            return false;
        }
        
        if (p.getPrice() != this.getPrice()) {
            return false;
        }
        
        return true;
    }

    
}
