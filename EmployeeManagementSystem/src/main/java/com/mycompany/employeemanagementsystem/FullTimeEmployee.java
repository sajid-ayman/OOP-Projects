package com.mycompany.employeemanagementsystem;

public class FullTimeEmployee extends Employee{
    private double annualSalary;
    public FullTimeEmployee(double annualSalary, String name, String ID, double baseSalary) {
        super(name, ID, baseSalary);
        this.annualSalary = annualSalary;
    }
}
