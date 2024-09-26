package com.example.inventory_system.ProductRepository;

import com.example.inventory_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods can be defined here if needed
}
