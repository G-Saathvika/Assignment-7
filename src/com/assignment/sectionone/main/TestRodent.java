package com.assignment.sectionone.main;

import com.assignment.sectionone.classes.Gerbil;
import com.assignment.sectionone.classes.Hamster;
import com.assignment.sectionone.classes.Mouse;
import com.assignment.sectionone.classes.Rodent;

public class TestRodent {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(),new Gerbil(),new Hamster()};

        for(Rodent rodent : rodents){
            rodent.eat();
        }
    }
}