package com.alcota.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.alcota.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
