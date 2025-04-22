package com.xworkz.late.internal.doctor;

public class SurgeonImpl implements Doctor {
    public SurgeonImpl() {
        System.out.println("no-arg const SurgeonImpl");
    }

    @Override
    public void treat() {
        System.out.println("treating patient in SurgeonImpl");
    }
}
