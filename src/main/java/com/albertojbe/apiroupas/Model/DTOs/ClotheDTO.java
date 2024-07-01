package com.albertojbe.apiroupas.Model.DTOs;

import com.github.dozermapper.core.Mapping;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

public class ClotheDTO extends RepresentationModel<ClotheDTO> implements Serializable {
    @Mapping("id")
    private long key;
    private String type;
    private String brand;
    private String size;
    private String price;
    private String quantity;

    public ClotheDTO() {

    }

    public ClotheDTO(long key, String type, String brand, String size, String price, String quantity) {
        this.key = key;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
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
