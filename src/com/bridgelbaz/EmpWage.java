package com.bridgelbaz;

public class EmpWage {

    public void empStatus() {
        System.out.println("Welcome Employees");
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
        }
    }


}
