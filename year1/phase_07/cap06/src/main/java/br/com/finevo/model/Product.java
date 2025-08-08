package br.com.finevo.model;

import java.time.LocalDate;

public class Product {

    private int code;
    private String name;
    private double value;
    private LocalDate fabricationDate;
    private int amount;
    private Category category;

    public Product(){

    }

    public Product(int code, String name, double value, LocalDate fabricationDate, int amount) {
        this.code = code;
        this.name = name;
        this.value = value;
        this.fabricationDate = fabricationDate;
        this.amount = amount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}