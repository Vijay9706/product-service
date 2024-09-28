package com.vijay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.entity.Product;
import com.vijay.service.IProductService;
import com.vijay.service.ProductService;

@RestController
@RequestMapping("/v1")
public class ProductController {
	
	
	
	@Autowired
    IProductService iProductService ;
	
	@RequestMapping(value = "/product/{id}" , method = RequestMethod.GET , produces = "application/json")
	public ResponseEntity<Product> getProduct(Integer Id){
	        Product product= iProductService.getProduct(Id);
		
		return new ResponseEntity<Product> (product , HttpStatus.OK) ;
	}
	
	@RequestMapping(value = "/product" , method = RequestMethod.GET , produces = "application/json")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> product= iProductService.getAllProduct();
		
		return new ResponseEntity<List<Product>> (product , HttpStatus.OK) ;
	}
	
	@RequestMapping(value = "/product" , method = RequestMethod.POST , produces = "application/json",consumes = "application/json")
	public ResponseEntity createProduct( @RequestBody Product P){
		iProductService.createProduct(P);
		
		return new ResponseEntity<> ("Product inserted succesffully" , HttpStatus.OK) ;
	}
	
	@RequestMapping(value = "/product" , method = RequestMethod.PUT , produces = "application/json")
	public ResponseEntity UpdateProduct( @RequestBody Product P){
         iProductService.UpdateProduct(P);
		
		return new ResponseEntity<> ("Product updated succesffully" , HttpStatus.OK) ;
	}

}
