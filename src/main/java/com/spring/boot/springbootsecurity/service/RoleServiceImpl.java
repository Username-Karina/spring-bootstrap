package com.spring.boot.springbootsecurity.service;

import com.spring.boot.springbootsecurity.entity.Role;
import com.spring.boot.springbootsecurity.reposotory.RoleRepository;
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
}
