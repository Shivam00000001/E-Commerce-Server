package com.ECommerce.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ECommerce.Entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
