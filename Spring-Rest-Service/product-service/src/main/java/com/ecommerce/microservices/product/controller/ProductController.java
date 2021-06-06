package com.ecommerce.microservices.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microservices.product.entity.Product;
import com.ecommerce.microservices.product.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
	
	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	
	@GetMapping
    public ResponseEntity<List<Product>> productList() {

        List<Product> productList = productService.findAll();
        
        return CollectionUtils.isEmpty(productList) ?
                new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(productList, HttpStatus.OK);
    }
	
}
