package com.xworkz.inheritence.internal.employee;

public class Company {
    public void operate(Employee employee) {
        employee.work();
        employee.salary();
        employee.benefits();
        employee.experience();
        employee.department();

        if (employee instanceof Manager) {
            System.out.println("Employee is instance of Manager");
            Manager manager = (Manager) employee;
            manager.conductMeeting();
        }
    }
}
