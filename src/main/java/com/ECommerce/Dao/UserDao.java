package com.ECommerce.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ECommerce.Entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {

}
