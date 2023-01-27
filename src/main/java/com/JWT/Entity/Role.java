package com.JWT.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {

	@Id
	private String roleName;
	private String roleDescription;
	
	
	public Role() {
		
	}
	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getRoleDescription() {
		return roleDescription;
	}


	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	
}
