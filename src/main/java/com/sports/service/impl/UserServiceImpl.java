package com.sports.service.impl;

import com.sports.model.User;
import com.sports.model.UserRole;
import com.sports.repo.RoleRepository;
import com.sports.repo.UserRepository;
import com.sports.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
       User existingUser = this.userRepository.findByEmail(user.getEmail());

       if(existingUser!=null) {
           System.out.println("User already Exist");
           throw new Exception("User arleary Exist");
       }else{
           //create user
           for(UserRole userRole : userRoles) {
               roleRepository.save(userRole.getRole());
           }
           user.getUserRoles().addAll(userRoles);
           existingUser = this.userRepository.save(user);
       }

       return  existingUser;
    }
}
