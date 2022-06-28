package com.training.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.products.entity.ProductEntity;
import com.training.products.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired 
	ProductService productSvc;
	
	@PostMapping("/add-product")
	public void createProduct(@RequestBody ProductEntity product ) {
		productSvc.createProduct(product);
	}

}
