package com.ecommerce.microservices.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.microservices.product.entity.Product;
import com.ecommerce.microservices.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	private final ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}




	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

}
