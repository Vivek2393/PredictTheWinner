package com.sports.service.impl;

import com.sports.model.Role;
import com.sports.repo.RoleRepository;
import com.sports.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getRole(Long id) throws Exception {
        return  this.roleRepository.getById(id);
    }
}
