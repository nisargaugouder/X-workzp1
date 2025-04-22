package com.xworkz.late.internal.teacher;

public class MathTeacherImpl implements Teacher {
    public MathTeacherImpl() {
        System.out.println("no-arg const MathTeacherImpl");
    }

    @Override
    public void teach() {
        System.out.println("Math teacher is teaching equations");
    }
}
