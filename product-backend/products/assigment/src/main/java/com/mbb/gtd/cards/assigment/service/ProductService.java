package com.mbb.gtd.cards.assigment.service;

import com.mbb.gtd.cards.assigment.model.Product;
import com.mbb.gtd.cards.assigment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

   
    @Transactional(readOnly = true)
    public Page<Product> getProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return productRepository.findAll(pageable);
    }

    
    @Transactional(readOnly = true)
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

   
    @Transactional
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

   
    @Transactional
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}