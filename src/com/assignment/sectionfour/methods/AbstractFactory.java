package com.assignment.sectionfour.methods;

import com.assignment.sectionfour.interfaces.Cycle;
import com.assignment.sectionfour.interfaces.CycleFactory;

public class AbstractFactory {
    public void createCycle(CycleFactory factory){
        Cycle c = factory.getCycle();
        c.ride();
        c.numberOfWheels();
    }
}
