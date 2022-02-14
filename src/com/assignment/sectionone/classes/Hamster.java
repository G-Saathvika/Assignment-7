package com.assignment.sectionone.classes;

public class Hamster extends Rodent {

    public Hamster(){
        System.out.println("This is a Hamster.");
    }

    @Override
    public void eat(){
        System.out.println("Hamster is eating.");
    }
}
