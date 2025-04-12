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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Employee){
                System.out.println("have ref.will compare..");
                Employee employee1=this;
                Employee employee2=(Employee) obj;
                if(employee1.id==employee2.id && employee1.name.equals(employee2.name)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
