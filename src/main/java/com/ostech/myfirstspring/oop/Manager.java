package com.ostech.myfirstspring.oop;

public class Manager extends Employee {
    String department;

    void printManagerDetails() {
        System.out.println("Department: " + department);
    }
}
