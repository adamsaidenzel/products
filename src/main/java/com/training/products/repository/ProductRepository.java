package com.training.products.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.products.entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity,Long>{

}
