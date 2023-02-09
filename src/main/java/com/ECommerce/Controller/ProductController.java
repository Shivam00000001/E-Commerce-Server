package com.ECommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ECommerce.Entity.Product;
import com.ECommerce.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/addNewProduct")
	public Product addNewProduct(@RequestBody Product product) {
		return productService.addNewProduct(product);
	}
}
