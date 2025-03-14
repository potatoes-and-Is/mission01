package com.missions.project;

public class Structure {
    private int cement;
    private int glass;
    private int steel;
    private int door;

    public Structure(int cement, int glass, int steel, int door) {
        this.cement = cement;
        this.glass = glass;
        this.steel = steel;
        this.door = door;
    }


    public int getCement() {
        return cement;
    }

    public void setCement(int cement) {
        this.cement = cement;
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    public int getSteel() {
        return steel;
    }

    public void setSteel(int steel) {
        this.steel = steel;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}
