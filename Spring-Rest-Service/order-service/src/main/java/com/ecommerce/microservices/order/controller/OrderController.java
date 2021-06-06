package com.ecommerce.microservices.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microservices.order.entity.Order;
import com.ecommerce.microservices.order.service.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
	
	private final OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	
	@GetMapping
    public ResponseEntity<List<Order>> orderList() {

        List<Order> orderList = orderService.findAll();
        
        return CollectionUtils.isEmpty(orderList) ?
                new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(orderList, HttpStatus.OK);
    }
	
}
