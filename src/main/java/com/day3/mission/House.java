package com.day3.mission;

public class House extends Structure {

    public House(int cement, int steel, int glass, int wood) {
        super(cement, steel, glass, wood);
    }

    @Override
    public void maintain(){
        System.out.println("도시가스 점검");
    }
}


