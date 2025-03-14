package com.missions.project;

public class Apartment extends Structure{

    private int gym;

    private Elevator elevator;


    public Apartment(int cement, int glass, int steel, int door, int gym, Elevator elevator) {
        super(cement, glass, steel, door);
        this.gym = gym;
        this.elevator = elevator;
    }

    public int getGym() {
        return gym;
    }

    public void setGym(int gym) {
        this.gym = gym;
    }

    public Elevator getElevator() {
        return elevator;
    }
}
