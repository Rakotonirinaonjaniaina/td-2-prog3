package com.exercice.prog3td2.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
        private List<Team> TeamList;

        public List<Team> getTeamList() {
            ArrayList<Team> TeamList = null;
            if(TeamList == null) {
                TeamList = new ArrayList<>();
            }
            return TeamList;
        }

        public void setTeamList(List<Team> TeamList) {
            this.TeamList = TeamList;
        }
}
