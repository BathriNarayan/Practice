package com.example.webapp;

public class Products {
    private int id;
    private String name;

    public Products(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Products add(Products prod) {
        prod.id=this.id;
        prod.name=this.name;
        return prod;
    }
}
