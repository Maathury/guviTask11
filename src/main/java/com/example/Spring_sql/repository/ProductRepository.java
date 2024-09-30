package com.example.Spring_sql.repository;

import com.example.Spring_sql.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
