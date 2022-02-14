package com.assignment.sectionfour.main;

import com.assignment.sectionfour.classes.BicycleFactory;
import com.assignment.sectionfour.classes.TricycleFactory;
import com.assignment.sectionfour.classes.UnicycleFactory;
import com.assignment.sectionfour.methods.AbstractFactory;

public class TestFactory {
    public static void main(String[] args) {

        AbstractFactory factory = new AbstractFactory();

        factory.createCycle(new UnicycleFactory());

        factory.createCycle(new BicycleFactory());

        factory.createCycle(new TricycleFactory());

    }
}
