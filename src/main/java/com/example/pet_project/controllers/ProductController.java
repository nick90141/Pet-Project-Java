package com.example.pet_project.controllers;

import com.example.pet_project.entities.Product;
import com.example.pet_project.entities.User;
import com.example.pet_project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //    ДОБАВЛЕНИЕ ОБЪЕКТА В БАЗУ ДАННЫХ ЧЕРЕЗ SPRING DATA
    @GetMapping("/new")
    public ResponseEntity<Product> newProduct() {
        Product product = new Product();
        product.setName("iPhone 12");
        product.setPrice(25000);
        product.setStockQuantity(3);
        product.setMemorySize(256);
        product.setColor("Red");
        product.setManufacturer("Apple");
        product.setNumberOfSimCards(1);

        Product savedProduct = productService.newProduct(product);
        return new ResponseEntity<Product>(savedProduct, HttpStatus.CREATED);
    }
//

    @GetMapping("/addNewForm")
    public String addNewForm(Model model) {
        model.addAttribute("product", new Product());
        return "addNewForm";
    }


    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products/saveProduct";
    }
    @GetMapping("/saveProduct")
    public String saveProduct() {
        return "saveProduct";
    }
}

//    @GetMapping("/editPrice")
//    public ResponseEntity<Product> editPrice(@RequestParam String name, @RequestParam double price) {
//        final Product product = productService.findByName(name);
//        product.setPrice(price);
//        productService.save(product);
//        return new ResponseEntity<>(product, HttpStatus.CREATED);
//    }