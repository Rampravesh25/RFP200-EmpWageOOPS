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

        int data = empWage.dailWage();
        System.out.println(" Emp Wage Calculated for Full Day :-" + data);
    }
}
