package com.xworkz.late.internal.college;

public class EngineeringCollegeImpl implements College {
    public EngineeringCollegeImpl() {
        System.out.println("no-arg const EngineeringCollegeImpl");
    }

    @Override
    public void study() {
        System.out.println("studying in EngineeringCollegeImpl");
    }
}
