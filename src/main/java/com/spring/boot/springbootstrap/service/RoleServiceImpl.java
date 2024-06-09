package com.spring.boot.springbootstrap.service;

import com.spring.boot.springbootstrap.entity.Role;
import com.spring.boot.springbootstrap.reposotory.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repository;

    @Autowired
    public RoleServiceImpl(RoleRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Role> allRoles() {
        return repository.findAll();
    }
    @Override
    public void saveRole(Role role) {
        repository.save(role);
    }

    @Override
    public Role findRoleById(int id) {
        return repository.getById(id);
    }
}
