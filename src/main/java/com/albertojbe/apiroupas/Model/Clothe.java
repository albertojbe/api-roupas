package com.albertojbe.apiroupas.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "roupas")
public class Clothe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo")
    private String type;

    @Column(name = "marca")
    private String brand;

    @Column(name = "tamanho")
    private String size;

    @Column(name = "quantidade")
    private String quantity;

    @Column(name = "preço")
    private String price;

    public Clothe() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setSize(String syze) {
        this.size = syze;
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
