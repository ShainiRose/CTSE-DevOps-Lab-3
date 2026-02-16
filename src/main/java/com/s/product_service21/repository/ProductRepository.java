package com.s.product_service21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.s.product_service21.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
