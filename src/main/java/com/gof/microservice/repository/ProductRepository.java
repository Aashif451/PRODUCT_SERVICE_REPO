package com.gof.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gof.microservice.Model.Product;

public interface ProductRepository extends MongoRepository<Product, String > {

}
