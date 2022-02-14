package com.assignment.sectionfour.classes;

import com.assignment.sectionfour.interfaces.Cycle;

public class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Riding Unicycle");
    }

    @Override
    public void numberOfWheels() {
        System.out.println("Unicycle has 1 wheel.");
    }
}
