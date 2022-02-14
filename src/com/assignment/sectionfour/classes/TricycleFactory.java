package com.assignment.sectionfour.classes;

import com.assignment.sectionfour.interfaces.Cycle;
import com.assignment.sectionfour.interfaces.CycleFactory;

public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
