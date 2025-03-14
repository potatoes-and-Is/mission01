package com.missions.project;

public class Application {
    public static void main(String[] args) {
        // 아파트 만들기
        Apartment ap = new Apartment(100, 50, 200, 500, 1, new Elevator());
        System.out.println("이 아파트는 " + ap.getCement() +"개의 시멘트와, "+ ap.getGlass() +"개의 유리와 "+ ap.getSteel() +"개의 철근으로 만들어졌으며, "+ ap.getDoor() +"개의 문과 "+ ap.getGym() +"개의 헬스장이 있습니다.");

        // 빌딩 만들기
        Building b = new Building(300, 100, 600, 800, 20, new Elevator());
        System.out.println("이 빌딩은 " + b.getCement() +"개의 시멘트와, "+ b.getGlass() +"개의 유리와 "+ b.getSteel() +"개의 철근으로 만들어졌으며, "+ b.getDoor() +"개의 문과 "+ b.getOffice() +"개의 사무실이 있습니다.");
        b.getElevator().movingUp();
        b.getElevator().movingDown();

        // 단독주택 만들기
        House h = new House(50, 10, 10, 100, 1);

        System.out.println("이 단독주택은 " + h.getCement() +"개의 시멘트와, "+ h.getGlass() +"개의 유리와 "+ h.getSteel() +"개의 철근으로 만들어졌으며, "+ h.getDoor() +"개의 문과 "+ h.getMadang() +"개의 마당이 있습니다.");

    }
}
