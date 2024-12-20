package com.product.Dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
