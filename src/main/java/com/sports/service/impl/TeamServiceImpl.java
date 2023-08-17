package com.sports.service.impl;

import com.sports.model.Role;
import com.sports.model.Team;
import com.sports.repo.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl {

    @Autowired
    private TeamRepository teamRepository;

    public Team getTeam(Long id) throws Exception {
        return  this.teamRepository.getById(id);
    }

    public  List<Team> getTeams(){
       return this.teamRepository.findAll();
    }
}
