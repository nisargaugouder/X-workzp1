package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.employee.Employee;
import com.xworkz.inheritence.internal.employee.Manager;
import com.xworkz.inheritence.internal.employee.Company;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.work();
        emp1.salary();
        emp1.benefits();
        emp1.experience();
        emp1.department();

        System.out.println("-------------------");

        Employee emp = new Manager();
        emp.work();
        emp.salary();
        emp.benefits();
        emp.experience();
        emp.department();

        System.out.println("-------------------");

        Manager manager = new Manager();
        manager.work();
        manager.salary();
        manager.benefits();
        manager.experience();
        manager.department();

        System.out.println("-------casting example------------");

        Company company = new Company();
        company.operate(emp);
        company.operate(emp1);
        company.operate(manager);
    }
}
