package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entiry.Product;
import com.example.reporitory.ProductRepository;

public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository; 

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Integer pid, Product product) {
		Optional<Product> existingProduct = productRepository.findById(pid);
		Product existingProd = existingProduct.get();
		existingProd.setId(product.getId());
		existingProd.setName(product.getName());
		existingProd.setPrice(product.getPrice());
		productRepository.save(existingProd);
		return existingProd;
	}

	@Override
	public Product deleteProduct(Integer pid) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		Optional<Product> existingProduct = productRepository.findById(pid);
		Product existingProd = existingProduct.get();
		productRepository.delete(existingProd);
		return existingProd;
	}
	
	

}
