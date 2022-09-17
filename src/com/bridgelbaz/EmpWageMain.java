package com.bridgelbaz;

public class EmpWageMain {

    public static void main(String[] args) {
        EmpWage empWage = new EmpWage();

        double check = empWage.empStatus();
        if (check == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
        }

        empWage.dailWage();
    }
}
