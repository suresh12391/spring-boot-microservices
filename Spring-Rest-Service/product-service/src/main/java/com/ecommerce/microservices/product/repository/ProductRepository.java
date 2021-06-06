package com.ecommerce.microservices.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecommerce.microservices.product.entity.Product;

/**
 * @author Vahap Gencdal
 * @email avahap19@gmail.com
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>,
        JpaSpecificationExecutor<Product> {
	
}