package com.example.pet_project.services;

import com.example.pet_project.entities.Product;
import com.example.pet_project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product newProduct(Product product) {
        return productRepository.save(product);
    }


//    public Product findByName(final String name) {
//        return productRepository.findByName(name);
//    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

}
