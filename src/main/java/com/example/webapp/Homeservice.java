package com.example.webapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class Homeservice {

    private List<Products> products = new ArrayList<>(Arrays.asList(
            new Products(20, "water"),
            new Products(40, "Biscuit"),
            new Products(10, "chocolate")
    ));

    public List<Products> getProducts() {
        return products;
    }

    public Optional<Products> getProductById(int productID) {
        return products.stream()
                .filter(product -> product.getId() == productID)
                .findFirst();
    }

    public void addProducts(Products prod) {
        products.add(prod);

    }
}
