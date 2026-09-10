package com.example.untitled.repository;
import com.example.untitled.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<Product, Long> {

}