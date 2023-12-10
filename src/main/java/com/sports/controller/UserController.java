package com.sports.controller;

import com.sports.dto.UserWithRoles;
import com.sports.model.Role;
import com.sports.model.User;
import com.sports.model.UserRole;
import com.sports.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    //create USer
    @PostMapping("/signup")
    public User createUser(@RequestBody UserWithRoles userRoles) throws Exception {
        Set<UserRole> userRolesSet = new HashSet<>();
        userRoles.getRolesOfUser().stream().forEach( role -> {
            UserRole userRole = new UserRole();
            userRole.setRole(role);
            userRole.setUser(userRoles.getUser());

            userRolesSet.add(userRole);
        });
        return this.userService.createUser(userRoles.getUser(), userRolesSet);
    }


}
