package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.subject.Subject;

public class SubjectRunner {
    public static void main(String[] args) {
        Subject subject = new Subject("Maths", 100, "Sharma");
        System.out.println(subject);
        System.out.println(subject.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(subject));
    }
}
