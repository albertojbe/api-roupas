package com.albertojbe.apiroupas.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "roupas")
public class Clothe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tipo", nullable = false)
    private String type;

    @Column(name = "marca", nullable = false)
    private String brand;

    @Column(name = "tamanho", nullable = false)
    private String size;

    @Column(name = "preço", nullable = false)
    private String price;

    @Column(name = "quantidade", nullable = false)
    private String quantity;


    public Clothe() {

    }

    public Clothe(Long id, String type, String brand, String size, String price, String quantity) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
