package com.sports.service;

import com.sports.model.User;
import com.sports.model.UserRole;

import java.util.Set;

public interface UserService {

    //create user
     public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
