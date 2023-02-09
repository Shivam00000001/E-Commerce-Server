package com.ECommerce.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ECommerce.Entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

}
