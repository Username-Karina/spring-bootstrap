package com.spring.boot.springbootsecurity.controllers;

import com.spring.boot.springbootsecurity.entity.User;
import com.spring.boot.springbootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public String showUser(Model model, Principal principal){
        User user = userService.getByEmail(principal.getName());
        model.addAttribute("user",user);
        return "user-info";
    }

}