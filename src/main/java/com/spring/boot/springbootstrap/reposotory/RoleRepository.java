package com.spring.boot.springbootstrap.reposotory;

import com.spring.boot.springbootstrap.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
