package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.employee.Employee;
import com.xworkz.inheritence.internal.employee.Manager;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        emp.salary();
        emp.benefits();
        emp.experience();
        emp.department();

        System.out.println("-----------");

        Employee managerRef = new Manager();
        managerRef.work();
        managerRef.salary();
        managerRef.benefits();
        managerRef.experience();
        managerRef.department();

        System.out.println("-----------");

        Manager manager = new Manager();
        manager.work();
        manager.salary();
        manager.benefits();
        manager.experience();
        manager.department();
    }
}
