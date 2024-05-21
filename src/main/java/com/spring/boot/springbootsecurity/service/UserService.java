package com.spring.boot.springbootsecurity.service;

import com.spring.boot.springbootsecurity.entity.User;

import java.util.List;

public interface UserService {
    User getByEmail(String email);
    List<User> all();
    void add(User user);
    User get(int id);
    void delete(int id);
    void edit(User user);
}
