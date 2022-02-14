package com.assignment.sectionfour.classes;

import com.assignment.sectionfour.interfaces.Cycle;

public class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding Bicycle");
    }
    @Override
    public void numberOfWheels() {
        System.out.println("Bicycle has 2 wheels.");
    }
}
