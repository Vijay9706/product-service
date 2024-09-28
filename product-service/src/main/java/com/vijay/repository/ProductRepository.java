package com.vijay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
