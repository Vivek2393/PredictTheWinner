package com.sports.controller;

import com.sports.model.Role;
import com.sports.model.User;
import com.sports.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    //create USer
  /*  @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        System.out.println("Request Recieved");

        Role role =  new Role();
        role.setRoleId(44L);
        role.setRoleName("ADMIN");

        user.setRoles(new HashSet<>(Arrays.asList(role)));

        return this.userService.createUser(user);
    }*/


}
