package com.xworkz.assignment.internal.employee;

public class Employee {
    private int id;
    private String name;
    private String role;

    public Employee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name=" + name + ", role=" + role + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("EmployeeHashCode:"+super.hashCode());
        return 72;
    }
}
