package com.albertojbe.apiroupas.Models.DTOs;

import jakarta.persistence.Column;

import java.io.Serializable;

public class ClotheDTO implements Serializable {
    private String type;
    private String brand;
    private String size;
    private String quantity;
    private String price;

    public ClotheDTO() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
