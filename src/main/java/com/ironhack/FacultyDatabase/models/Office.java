package com.ironhack.FacultyDatabase.models;

import javax.persistence.*;

@Entity
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int room_number;
    private String building;

    public Office() {
    }

    public Office(int room_number, String building) {
        this.room_number = room_number;
        this.building = building;
    }

    public int getId() {
        return id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
