package com.assignment.sectionfour.classes;

import com.assignment.sectionfour.interfaces.Cycle;

public class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding Tricycle");
    }
    @Override
    public void numberOfWheels() {
        System.out.println("Tricycle has 3 wheels.");
    }
}
