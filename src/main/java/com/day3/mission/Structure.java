package com.day3.mission;

import java.sql.SQLOutput;

public class Structure {
    private int cement;
    private int steel;
    private int glass;
    private int wood;
    protected Elevator elevator;

    public Structure(int cement, int steel, int glass, int wood) {
        this.cement = cement;
        this.steel = steel;
        this.glass = glass;
        this.wood = wood;
    }
    public Structure(int cement, int steel, int glass, int wood, Elevator elevator) {
        this.cement = cement;
        this.steel = steel;
        this.glass = glass;
        this.wood = wood;
        this.elevator = elevator;
    }

    public Structure(){
    }

    public void build(){
        System.out.println("Building Structure");
    }

    public void maintain(){
        System.out.println("Maintain Structure");
    }

    public void inAndOut(){
        System.out.println("In And Out Structure");
    }

    public int getCement() {
        return cement;
    }

    public void setCement(int cement) {
        if(cement < 0){
//            this.cement = 0;
            System.out.println("잘못된 시멘트 값입니다. 0 이상의 값을 넣어주세요.");
        } else if(cement > 1000) {
            System.out.println("시멘트 양이 너무 많습니다. 1000 미만으로 넣어주세요");
        } else if(cement > 0 && cement < 1000){
            this.cement = cement;
            System.out.println("cement = " + cement);
        } else {
            System.out.println("유효한 값이 아닙니다.");
        }
    }

    public int getSteel() {
        return steel;
    }

    public void setSteel(int steel) {
        this.steel = steel;
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public void evWork(){
        elevator.down();
        elevator.up();
        elevator.stop();
    }
}
