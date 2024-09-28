package com.vijay.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Table(name = "Product")
@Entity
public class Product {

	@Id
	private Integer productId;
	
	@Column(name ="product_Code")
	private String productCode;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="quantity")
	private int quantity;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "description")
	private String description;
	
	
}
