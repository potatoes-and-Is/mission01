package com.day5.plant;

import com.day5.Flying;
import com.day5.Plant;

public class Butterfly extends Plant implements Flying {
    private int dudme;

    public Butterfly(String name, int dudme) {
        super(name);
    }

    @Override
    public void flySpeed() {
        System.out.println("5km/h");
    }
}
