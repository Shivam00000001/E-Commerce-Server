package com.JWT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JWT.Dao.RoleDao;
import com.JWT.Entity.Role;

@Service
public class RoleService {

	@Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
