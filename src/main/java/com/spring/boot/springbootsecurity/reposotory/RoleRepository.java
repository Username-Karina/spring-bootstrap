package com.spring.boot.springbootsecurity.reposotory;

import com.spring.boot.springbootsecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
