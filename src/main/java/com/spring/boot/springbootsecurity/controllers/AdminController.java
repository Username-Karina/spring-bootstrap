package com.spring.boot.springbootsecurity.controllers;

import com.spring.boot.springbootsecurity.entity.User;
import com.spring.boot.springbootsecurity.service.RoleService;
import com.spring.boot.springbootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public AdminController(UserService userService, RoleService roleService){
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping
    public String All(Model model) {
        model.addAttribute("all", userService.all());
        return "admin-panel";
    }

    @RequestMapping (value = "/add")
    public String add(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("allRoles", roleService.allRoles());
        return "new-user-form";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user){
        userService.add(user);
        return "redirect:/admin";
    }

    @GetMapping("/{id}")
    public String get(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.get(id));
        return "user-info";
    }

    @GetMapping("/{id}/edit")
    public String update(Model model,@PathVariable("id") int id){
        model.addAttribute("user", userService.get(id));
        model.addAttribute("allRoles",roleService.allRoles());
        return "edit-user-info";
    }

    @PostMapping("/{id}")
    public String edit(User user){
        userService.edit(user);
        return "redirect:/admin";
    }

    @GetMapping ("/{id}/delete")
    public String delete(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/admin";
    }

}
