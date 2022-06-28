package com.training.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.products.entity.ProductEntity;
import com.training.products.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	public void createProduct(ProductEntity product) {
		productRepo.save(product);
	}

}
