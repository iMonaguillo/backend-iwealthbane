package com.iwealthbane.canelon.CRUD.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductDto {

    @NotBlank(message = "product name is mandatory")
    private String customer;
    @NotBlank(message = "product name is mandatory")
    private String name;
    @Min(value = 1, message = "product price is mandatory")
    private double price;
    @Min(value = 1, message = "product quantity is mandatory")
    private int quantity;
    @NotBlank(message = "product name is mandatory")
    private String status;


    public ProductDto() {
    }

    public ProductDto(String customer, String name, double price, int quantity, String status) {
        this.customer = customer;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.status = status;

    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
