package com.missions.structureproject;

public class Building extends Structure {

    private int office;
    private Elevator elevator;

    public Building(int door, int glass, int steel, int cement, int office, Elevator elevator) {
        super(door, glass, steel, cement);
        this.office = office;
        this.elevator = elevator;
    }

    @Override
    public void lightHouse() {
        System.out.println("판교 등대");
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
