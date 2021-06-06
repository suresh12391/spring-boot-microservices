package com.ecommerce.microservices.product.entity;


import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Vahap Gencdal
 * @email avahap19@gmail.com
 */

@Data
@Entity
@Table(name = "PRODUCTS")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "NAME", nullable = false)
    private String name;
	
	@Column(name = "desc", nullable = false)
    private String DESC;
	
	@Column(name = "QUANTITY", nullable = false)
    private Integer quantity;
    
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;
    
    @Column(name = "IS_ACTIVE")
    private Boolean isActive = Boolean.TRUE;
    
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    
    @Column(name = "CREATED_BY")
    private Long createdBy;
    
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

}