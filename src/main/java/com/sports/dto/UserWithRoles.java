package com.sports.dto;

import com.sports.model.Role;
import com.sports.model.User;
import lombok.Data;

import java.util.List;

@Data
public class UserWithRoles {

    User user;
    List<Role> rolesOfUser;
}
