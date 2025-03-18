package com.day5.predetor;

import com.day5.Flying;
import com.day5.Predetor;

public class Eagle extends Predetor implements Flying{

    public Eagle(String name, int teeth) {
        super(name, teeth);
    }

    @Override
    public void flySpeed() {
        System.out.println("30km/h");
    }
}
