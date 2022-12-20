package com.exercice.prog3td2.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Sponsor {
    @Autowired
    private com.exercice.prog3td2.controler.Sponsor Sponsor;
    @GetMapping("/Sponsor")
    public List<Sponsor> getSponsor()
    {
        return this.Sponsor.getSponsor();
    }

    @GetMapping("/Sponsor/{SponsorId}")
    public Sponsor getSponsor(@PathVariable String SponsorId)
    {
        return this.Sponsor.getSponsor(SponsorId);
    }
    @PostMapping("/Sponsor")
    public Team addTeam(@RequestBody Sponsor Sponsor)
    {
        return this.Sponsor.addTeam(Sponsor);
    }
    @PutMapping("/Sponsor/{Sponsor}")
    public Sponsor updateSponsor(@PathVariable String SponsorId,@RequestBody Sponsor Sponsor)
    {
        return this.Sponsor.updateSponsor((SponsorId),Sponsor);
    }

    @DeleteMapping("/Sponsor/{SponsorId}")
    public List<Sponsor> deleteSponsor(@PathVariable String SponsorId)
    {
        return (List<Sponsor>) this.Sponsor.deleteSponsor(SponsorId);

    }
}
