
package edu.unsis.model.entity;

public class Sale {
    private String code;
    private String date;
    private double income;
    private String saleFor;
    private String codesProducts;

    public Sale() {
    }

    public Sale(String code, String date, double income, String saleFor, String codesProducts) {
        this.code = code;
        this.date = date;
        this.income = income;
        this.saleFor = saleFor;
        this.codesProducts = codesProducts;
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
