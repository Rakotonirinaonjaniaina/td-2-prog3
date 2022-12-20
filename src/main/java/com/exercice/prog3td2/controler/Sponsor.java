package com.exercice.prog3td2.controler;

public class Sponsor {
        private long id;
        private String Name;

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return Name;
        }
        public void setName(String Name) {
            this.Name = Name;
        }
    @Override
    public String toString() {
        return "Team [id=" + id + ", Name=" + "Name=";
    }
}
