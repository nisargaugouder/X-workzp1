package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.employee.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Rahul", "Developer");
        System.out.println(employee);
    }
}
