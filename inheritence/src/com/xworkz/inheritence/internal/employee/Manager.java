package com.xworkz.inheritence.internal.employee;

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("Running non-arg constructor Manager--child");
    }

    @Override
    public void work() {
        System.out.println("Manager manages the team and projects--child");
    }

    @Override
    public void salary() {
        System.out.println("Manager gets higher salary--child");
    }

    @Override
    public void benefits() {
        System.out.println("Manager gets extra benefits--child");
    }

    @Override
    public void experience() {
        System.out.println("Manager has more experience--child");
    }

    @Override
    public void department() {
        System.out.println("Manager leads a specific department--child");
    }

    public void conductMeeting() {
        System.out.println("New method conductMeeting in child class");
    }
}
