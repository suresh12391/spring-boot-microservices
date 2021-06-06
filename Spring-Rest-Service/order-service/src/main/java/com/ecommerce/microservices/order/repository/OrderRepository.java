package com.ecommerce.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ecommerce.microservices.order.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long>,
JpaSpecificationExecutor<Order> {
	

}
