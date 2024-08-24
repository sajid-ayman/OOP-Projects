package com.mycompany.employeemanagementsystem;

public class PartTimeEmployee extends Employee {
    private double hourlyWage ;
    private int weeklyWorkingHours;
    public PartTimeEmployee(double hourlyWage, int weeklyWorkingHours, String name, String ID, double baseSalary) {
        super(name, ID, baseSalary);
        this.hourlyWage = hourlyWage;
        this.weeklyWorkingHours = weeklyWorkingHours;
    }
}
