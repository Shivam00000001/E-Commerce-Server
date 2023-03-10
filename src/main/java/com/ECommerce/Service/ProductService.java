package com.ECommerce.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.Dao.ProductDao;
import com.ECommerce.Entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public Product addNewProduct(Product product) {
		return productDao.save(product);
	}
	
	public List<Product> getAllProducts() {
		return (List)productDao.findAll();
	}
	
	public Product getProductDetailsById(Integer productId) {
		return productDao.findById(productId).get();
	}

	public void deleteProductDetails(Integer productId) {
		// TODO Auto-generated method stub
		productDao.deleteById(productId);
	}
}
