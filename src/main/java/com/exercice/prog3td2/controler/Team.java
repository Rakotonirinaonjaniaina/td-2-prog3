package com.exercice.prog3td2.controler;

public class Team {
    private long id;
    private String name;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Team [id=" + id + ", name=" + "name=";
    }
}
