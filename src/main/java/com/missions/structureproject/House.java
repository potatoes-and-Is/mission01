package com.missions.structureproject;

public class House extends Structure {

    private int yard;

    public House(int door, int glass, int steel, int cement, int yard) {
        super(door, glass, steel, cement);
        this.yard = yard;
    }

    @Override
    public void grass() {
        System.out.println("잔디 잘렸다.");
    }

    public int getYard() {
        return yard;
    }

    public void setYard(int yard) {
        this.yard = yard;
    }
}
