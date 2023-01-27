package com.JWT.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JWT.Entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
