package com.missions.project;

public class House extends Structure {

    private int madang;

    public House(int cement, int glass, int steel, int door, int madang) {
        super(cement, glass, steel, door);
        this.madang = madang;
    }

    public int getMadang() {
        return madang;
    }

    public void setMadang(int madang) {
        this.madang = madang;
    }

}
