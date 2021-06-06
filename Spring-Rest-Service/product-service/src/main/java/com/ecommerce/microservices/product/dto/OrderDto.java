package com.ecommerce.microservices.product.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrderDto {
	
	
    private Long id;
	
    private String name;
    private Long productId;
    private Integer amount;
    private BigDecimal price;
    private LocalDateTime createdAt;
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private Boolean isActive;
   
}
