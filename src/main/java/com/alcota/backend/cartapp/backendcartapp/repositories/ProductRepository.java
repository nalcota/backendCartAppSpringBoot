package com.alcota.backend.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alcota.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
