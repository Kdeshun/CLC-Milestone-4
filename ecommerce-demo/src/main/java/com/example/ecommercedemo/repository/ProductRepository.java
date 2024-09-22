package com.example.ecommercedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommercedemo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}