package com.sports.controller;

import com.sports.model.Team;
import com.sports.service.impl.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    TeamServiceImpl teamService;

    @GetMapping("/all")
    public List<Team> getAllTeams(){
        return  teamService.getTeams();
    }
}
