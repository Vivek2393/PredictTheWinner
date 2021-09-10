package com.sports.service.impl;

import com.sports.model.User;
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

    @Override
    public User createUser(User user) throws Exception {
       User existingUser = this.userRepository.findByemail(user.getEmail());

       if(existingUser!=null)
       {
           System.out.println("User already Exist");
           throw new Exception("User arleary Exist");
       }else{
           //create user
           existingUser = this.userRepository.save(user);
       }

       return  existingUser;
    }
}
