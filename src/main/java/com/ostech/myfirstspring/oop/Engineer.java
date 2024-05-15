package com.ostech.myfirstspring.oop;

public class Engineer extends Employee {
    String specialization;

    void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Specialization: " + specialization);
    }
}
