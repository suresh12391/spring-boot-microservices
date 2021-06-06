package com.ecommerce.microservices.order.service;

import java.util.List;

import com.ecommerce.microservices.order.entity.Order;


public interface OrderService {
	List<Order> findAll();
}
