package com.missions.structureproject;

public class Elevator {

    private int floor = 1;

    void up() {
        floor++;
        System.out.println(floor + "층 입니다.");
    }

    void down() {
        if (floor == 1) {
            System.out.println(floor + "층 입니다.");
        } else {
            floor--;
            System.out.println(floor + "층 입니다.");
        }

    }
}
