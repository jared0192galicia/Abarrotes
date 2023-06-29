/**
 * @autor Galicia Cordova Elietzer Jared
 * Creado: 14 / jun / 2023
 * modificado 29 / Jun / 2023
 * Descripcion: Objeto usuario
 */
package edu.unsis.model.entity;

public class Sale {
    private String code;
    private String date;
    private double income;
    private String saleFor;
    private String codesProducts;

    public Sale() {}

    /**
     * Constructor with all properties
     * @param code
     * @param date
     * @param income
     * @param saleFor
     * @param codesProducts 
     */
    public Sale(String code, String date, double income, String saleFor, String codesProducts) {
        this.code = code;
        this.date = date;
        this.income = income;
        this.saleFor = saleFor;
        this.codesProducts = codesProducts;
    }
    
    /**
     * Generate code of the sale
     * @return 
     */
    public static String generateCode() {
        String code = "2023";
        
        for (int i = 0; i < 10; i++) {
            code += (String.valueOf((int) (Math.random() * 9)));
        }
        return code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getSaleFor() {
        return saleFor;
    }

    public void setSaleFor(String saleFor) {
        this.saleFor = saleFor;
    }

    public String getCodesProducts() {
        return codesProducts;
    }

    public void setCodesProducts(String codesProducts) {
        this.codesProducts = codesProducts;
    }
    
    
}
