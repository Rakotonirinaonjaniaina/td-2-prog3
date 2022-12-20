package com.exercice.prog3td2.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Team {
@Autowired
    private com.exercice.prog3td2.controler.Team Team;
@GetMapping("/Team")
    public List<Team> getTeam()
    {
        return this.Team.getTeam();
    }

    @GetMapping("/Team/{TeamId}")
    public Team getTeam(@PathVariable String TeamId)
    {
        return this.Team.getTeam(TeamId);
    }
    @PostMapping("/Team")
    public Team addTeam(@RequestBody Team Team)
    {
        return this.Team.addTeam(Team);
    }

    @PutMapping("/Team/{TeamId}")
    public Team updateTeam(@PathVariable String TeamId,@RequestBody Team Team)
    {
        return this.Team.updateTeam((TeamId),Team);
    }

    @DeleteMapping("/Team/{TeamId}")
    public List<Team> deleteTeam(@PathVariable String TeamId)
    {
        return (List<Team>) this.Team.deleteTeam(TeamId);

    }
}