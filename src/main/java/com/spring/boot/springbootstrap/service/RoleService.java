package com.spring.boot.springbootstrap.service;

import com.spring.boot.springbootstrap.entity.Role;

import java.util.List;


public interface RoleService {
    List<Role> allRoles();
    void saveRole(Role role);
    Role findRoleById(int id);
}
