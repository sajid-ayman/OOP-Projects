package com.mycompany.employeemanagementsystem;

public class Employee {
   private String name;    
   private String ID;
   private double baseSalary ;
    public Employee(String name, String ID, double baseSalary) {
        this.name = name;
        this.ID = ID;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", ID=" + ID + ", baseSalary=" + baseSalary + '}';
    }
    
}
