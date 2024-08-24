package com.mycompany.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private int maximumNumberOfEmployee;
    private List<Employee> employees;
    public EmployeeManagementSystem() {
        this.maximumNumberOfEmployee = 3;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee e1) {
        if (maximumNumberOfEmployee > 0) {
            employees.add(e1);
            maximumNumberOfEmployee--;
            System.out.println("Employee has been added successfully");
        } else {
            System.out.println("Sorry, we don't need any more employees.");
        }
    }
    public void printInfo() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void main(String[] args) {
        // Assuming Employee class is defined elsewhere with a proper toString method
        Employee e1 = new Employee("Ahmad", "389522", 20000);
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.addEmployee(e1);
        ems.printInfo();
    }
}
