package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.subject.Subject;

public class SubjectRunner {
    public static void main(String[] args) {
        Subject subject = new Subject("Maths", 100, "Sharma");
        System.out.println(subject);
        System.out.println(subject.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(subject));

        Subject subject1 = new Subject("Science", 100, "Gupta");
        Subject subject2 = new Subject("Maths", 100, "Sharma");

        boolean same = subject1.equals(subject2);
        System.out.println("same: " + same);
    }
}
