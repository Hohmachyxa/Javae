package com.example.untitled.service;
import com.example.untitled.entity.Product;
import com.example.untitled.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository qrepository;

    public Product saveProduct(Product product){
        return qrepository.save(product);
    }

    public List<Product> getAllproducts () {
        return qrepository.findAll();
    }
}
