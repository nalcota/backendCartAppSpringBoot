package com.alcota.backend.cartapp.backendcartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.alcota.backend.cartapp.backendcartapp.models.entities.Product;
import com.alcota.backend.cartapp.backendcartapp.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ProductController {


    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list(){
        return service.findAll();
    }

}
