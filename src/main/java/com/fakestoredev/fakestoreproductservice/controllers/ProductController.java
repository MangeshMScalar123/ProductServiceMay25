package com.fakestoredev.fakestoreproductservice.controllers;

import com.fakestoredev.fakestoreproductservice.models.Product;
import com.fakestoredev.fakestoreproductservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long productId) {
        return productService.getProduct(productId);
    }

    @GetMapping("/")
    public List<Product> getProducts() {
        return new ArrayList<>();
    }
    @PostMapping("/")
    public Product addProduct(@RequestBody Product product) {
        return new Product();
    }
    @PatchMapping("/")
    public Product updateProduct(@RequestBody Product product) {
        return new Product();
    }
    @DeleteMapping("/")
    public ResponseEntity<Void> deleteProduct(@RequestBody Product product) {
        return null;
    }
}
