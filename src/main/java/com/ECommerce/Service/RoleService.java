package com.ECommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.Dao.RoleDao;
import com.ECommerce.Entity.Role;

@Service
public class RoleService {

	@Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
