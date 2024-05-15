package com.ostech.myfirstspring.oop;

public class Example1 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Amila";
        manager.salary = 100000;
        manager.department = "HR";

        manager.printManagerDetails();
        manager.printEmployeeDetails();
    }
}
