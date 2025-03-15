package com.missions.structureproject;

public class Structure {

    private int door;
    private int glass;
    private int steel;
    private int cement;

    public Structure(int door, int glass, int steel, int cement) {
        this.door = door;
        this.glass = glass;
        this.steel = steel;
        this.cement = cement;
    }

    public void song() {
        System.out.println("로제");
    }

    public void lightHouse() {
        System.out.println("강남 등대");
    }

    public void grass() {
        System.out.println("잔디 자랐다.");
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        if (door < 0) {
            this.door = 0;
        } else {
            this.door = door;
        }
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        if (glass < 0) {
            this.glass = 0;
        } else {
            this.glass = glass;
        }
    }

    public int getSteel() {
        return steel;
    }

    public void setSteel(int steel) {
        if (steel < 0) {
            this.steel = 0;
        } else {
            this.steel = steel;
        }
    }

    public int getCement() {
        return cement;
    }

    public void setCement(int cement) {
        if (cement < 0) {
            this.cement = 0;
        } else {
            this.cement = cement;
        }
    }
}