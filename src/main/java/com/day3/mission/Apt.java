package com.day3.mission;

public class Apt extends Structure{
//    public Apt(int cement, int steel, int glass, int wood, Elevator elevator)
    public Apt(int cement, int steel, int glass, int wood, Elevator elevator) {
        super(cement, steel, glass, wood, elevator);
//        super(cement, steel, glass, wood);
    }

    public Apt() {

    }

    @Override
    public void maintain() {
        System.out.println("아파트 도색");
    }





}




