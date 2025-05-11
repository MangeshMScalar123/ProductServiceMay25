package com.fakestoredev.fakestoreproductservice.services;

import com.fakestoredev.fakestoreproductservice.models.Product;

import java.util.List;

public interface ProductService {
 Product createProduct(Product product);
 Product getProduct(Long id);
 List<Product> getProducts();
 Product updateProduct(Product product);
 boolean deleteProduct(Long id);
}
