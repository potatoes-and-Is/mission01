package com.missions.project;

public class Elevator {
    private int floor = 1;

    public void movingUp() { // 한 층 올라간다.
        System.out.println("올라갑니다.");
        floor++;
        System.out.println("현재 층은  " + floor + " 층 입니다.");
    }

    public void movingDown() { // 한 층 내려간다.
        System.out.println("내려갑니다.");
        floor--;
        System.out.println("현재 층은  " + floor + " 층 입니다.");
    }
}
