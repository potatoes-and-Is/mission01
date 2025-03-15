package com.missions.structureproject;

public class Application {
    public static void main(String[] args) {

        Apartment apt = new Apartment(1, 2, 3, 4, 5, new Elevator());
        System.out.print("아파트 : ");
        apt.song();
        apt.getElevator().up();
        apt.getElevator().down();
        System.out.println();

//        apt.setDoor(1);
//        apt.setGlass(2);
//        apt.setSteel(3);
//        apt.setCement(4);
//        apt.setGym(5);

        System.out.println("문 " + apt.getDoor() + "개 사용");
        System.out.println("유리 " + apt.getGlass() + "개 사용");
        System.out.println("철근 " + apt.getSteel() + "개 사용");
        System.out.println("시멘트 " + apt.getCement() + "개 사용");
        System.out.println("헬스장 " + apt.getGym() + "개 존재");
        System.out.println();

        Building build = new Building(6, 7, 8, 9, 10, new Elevator());
        System.out.print("빌딩 : ");
        build.lightHouse();
        build.getElevator().up();
        build.getElevator().down();
        build.getElevator().down();
        System.out.println();

//        build.setDoor(6);
//        build.setGlass(7);
//        build.setSteel(8);
//        build.setCement(9);
//        build.setOffice(10);

        System.out.println("문 " + build.getDoor() + "개 사용");
        System.out.println("유리 " + build.getGlass() + "개 사용");
        System.out.println("철근 " + build.getSteel() + "개 사용");
        System.out.println("시멘트 " + build.getCement() + "개 사용");
        System.out.println("사무실 " + build.getOffice() + "개 존재");
        System.out.println();

        House house = new House(11, 12, 13, 14, 15);
        System.out.print("주택 : ");
        house.grass();
//        house.setDoor(11);
//        house.setGlass(12);
//        house.setSteel(13);
//        house.setCement(14);
//        house.setYard(15);


        System.out.println("문 " + house.getDoor() + "개 사용");
        System.out.println("유리 " + house.getGlass() + "개 사용");
        System.out.println("철근 " + house.getSteel() + "개 사용");
        System.out.println("시멘트 " + house.getCement() + "개 사용");
        System.out.println("마당 " + house.getYard() + "개 존재");
    }
}
