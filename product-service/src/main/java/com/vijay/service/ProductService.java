package com.vijay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vijay.entity.Product;
import com.vijay.repository.ProductRepository;

@Service
public class ProductService implements IProductService   {

	@Autowired
	ProductRepository productRepository;
	
	
	
	@Override
	public Product getProduct(Integer Id) {
		  
	Optional<Product> product=	productRepository.findById(Id);
		
		return product.get();
	}
	

	@Override
	public List<Product> getAllProduct() {
		List<Product> productsList= productRepository.findAll();
		return productsList;
	}

	@Override
	public void createProduct(Product P) {
		productRepository.save(P);
		
	}

	@Override
	public void UpdateProduct(Product P) {
		productRepository.save(P);
		
	}

	
	
	
	
	
	
	

}
