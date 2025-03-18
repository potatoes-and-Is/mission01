package com.day5;

public interface Flying {

    default void fly() {
        System.out.println("날기");
    }

    void flySpeed();
}
