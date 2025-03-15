package com.missions.structureproject;

public class Apartment extends Structure {

    private int gym;
    private Elevator elevator;

    public Apartment(int door, int glass, int steel, int cement, int gym, Elevator elevator) {
        super(door, glass, steel, cement);
        this.gym = gym;
        this.elevator = elevator;
    }

    @Override
    public void song() {
        System.out.println("윤수일");
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
