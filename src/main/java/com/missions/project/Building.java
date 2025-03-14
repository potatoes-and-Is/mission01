package com.missions.project;

public class Building extends Structure {

    private int office;

    private Elevator elevator;

    public Building(int cement, int glass, int steel, int door, int office, Elevator elevator) {
        super(cement, glass, steel, door);
        this.office = office;
        this.elevator = elevator;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public Elevator getElevator() {
        return elevator;
    }
}
