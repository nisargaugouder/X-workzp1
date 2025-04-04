package com.xworkz.inheritence.internal.employee;

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("Manager created --child");
    }

    @Override
    public void work() {
        System.out.println("Manager oversees projects --child");
    }

    @Override
    public void salary() {
        System.out.println("Manager earns higher salary --child");
    }

    @Override
    public void benefits() {
        System.out.println("Manager gets extra perks --child");
    }

    @Override
    public void experience() {
        System.out.println("Manager has leadership experience --child");
    }

    @Override
    public void department() {
        System.out.println("Manager leads a department --child");
    }
}
