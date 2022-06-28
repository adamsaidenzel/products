package com.training.products.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data //@Getter and @Setter
@Entity
@Table(name="products")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;
	
	@Column(name = "product_name")
	String productName;
	
	@Column(name="product_price")
	Double price;
	
	@Column(name="quality_descriptor")
	String qualityDescriptor;
	
	@Column(name="rating")
	Integer rating;
	
	@Column(name ="is_available")
	Boolean available;
	
	@Column(name="created_date")
	LocalDateTime createdDate;
	
	@Column(name="updated_date")
	LocalDateTime updatedDate;

}
