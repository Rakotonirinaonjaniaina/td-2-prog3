package model;

import jakarta.persistence.Column;

public class model {
    private long id;

    @Column(name = "team")
    private String team;

    @Column(name = "player")
    private String player;

    @Column(name = "sponsor")
    private boolean sponsor;

    public boolean model (){
        	public model(String team, String player, String sponsor) {
            this.team = team;
            this.player = player;
            this.sponsor = sponsor;
        }
        public String getTeam() {
            return team;
        }

        public void setteam(String team) {
            this.team = team;
        }

        public String player() {
            return player;
        }

        public void setplayer(String player) {
            this.player = player;
        }

        public String issponsor = null () {
            return sponsor;
        }

        public void setsponsor(String issponsor) {
            this.sponsor = Boolean.parseBoolean(issponsor);
        }
    }
    @Override
    public String toString() {
        return "model [team=" + team + ", player=" + player + ", sponsor=" + sponsor + "]";
    }
}
