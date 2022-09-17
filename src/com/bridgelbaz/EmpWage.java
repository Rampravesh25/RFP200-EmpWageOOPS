package com.bridgelbaz;

public class EmpWage {

    int perHourWage = 20;
    int fullTime = 8;
    int partTime = 4;

    public int empStatus() {
        int check1;
        System.out.println("Welcome Employees:-");
        return check1 = (int) Math.floor(Math.random() * 10) % 2;
    }

    public int dailWage() {
        int wage;
        System.out.println("Calculate Daily Emp Wage !! ");
        return wage = perHourWage * fullTime;
    }
}
