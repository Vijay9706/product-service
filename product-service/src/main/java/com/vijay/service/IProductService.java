package com.vijay.service;

import java.util.List;

import com.vijay.entity.Product;

public interface IProductService {
	
	Product getProduct(Integer Id);
	List<Product> getAllProduct();
	void createProduct(Product P);
	void  UpdateProduct(Product P);
	
	
	

}
