package com.xworkz.inheritence.internal.employee;

public class Employee {
    public Employee() {
        System.out.println("Employee created --parent");
    }

    public void work() {
        System.out.println("Employee performs tasks --parent");
    }

    public void salary() {
        System.out.println("Employee receives salary --parent");
    }

    public void benefits() {
        System.out.println("Employee gets benefits --parent");
    }

    public void experience() {
        System.out.println("Employee gains experience --parent");
    }

    public void department() {
        System.out.println("Employee works in a department --parent");
    }
}
