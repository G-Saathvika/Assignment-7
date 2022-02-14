package com.assignment.sectionfive.main;

import com.assignment.sectionfive.classes.FirstClass;
import com.assignment.sectionfive.classes.SecondClass;

public class InnerClassDemo {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        FirstClass.FirstInner fin = sc.new FirstInner("Inside first inner class!");

    }
}
