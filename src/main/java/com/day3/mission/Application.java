package com.day3.mission;

public class Application {
    public static void main(String[] args) {
        Apt apt = new Apt(100, 100, 100, 100, new Elevator());
        apt.setCement(800);
        System.out.println(apt.getCement());
        apt.evWork();
        apt.elevator.stop();
    }
}
