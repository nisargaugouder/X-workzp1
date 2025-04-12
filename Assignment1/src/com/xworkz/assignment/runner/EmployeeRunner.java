package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.employee.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Rahul", "Developer");
        System.out.println(employee);
        System.out.println(employee.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(employee));

        Employee employee1 = new Employee(102, "Ankit", "Tester");
        Employee employee2 = new Employee(101, "Rahul", "Developer");

        boolean same = employee1.equals(employee2);
        System.out.println("same:" + same);
    }
}
