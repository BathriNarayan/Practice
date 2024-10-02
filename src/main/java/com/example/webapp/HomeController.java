package com.example.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private Homeservice homeservice;

    @RequestMapping("/homecontroller/{productID}")
    public Optional<Products> homecontrollerProductID(@PathVariable int productID) {
        return homeservice.getProductById(productID);
    }

    @GetMapping("/homecontroller/product")
    public List<Products> getAllProducts() {
        return homeservice.getProducts();
    }

    @PostMapping("/homecontroller/product")
    public void addProduct(@RequestBody Products product) {
        homeservice.addProducts(product);
        System.out.println(product);
    }


}
