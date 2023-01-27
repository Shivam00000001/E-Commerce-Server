package com.JWT.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JWT.Entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {

}
