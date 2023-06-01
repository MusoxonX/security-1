package com.sitelabs.security1.repository;

import com.sitelabs.security1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
