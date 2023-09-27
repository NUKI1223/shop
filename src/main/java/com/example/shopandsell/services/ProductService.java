package com.example.shopandsell.services;

import com.example.shopandsell.models.Product;
import com.example.shopandsell.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository PRODUCTSREPOSITORY;

    public List<Product> productsList(String title){
        if (title!=null) return PRODUCTSREPOSITORY.findByTitle(title);
        return PRODUCTSREPOSITORY.findAll();
    }
    public void saveProduct(Product product){
        log.info("Saving new {}", product);
        PRODUCTSREPOSITORY.save(product);
    }
    public void deleteProduct(Long prId){
        PRODUCTSREPOSITORY.deleteById(prId);
    }

    public Product getProductById(Long id) {
        return PRODUCTSREPOSITORY.findById(id).orElse(null);
    }
}

