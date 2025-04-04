package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.subject.Subject;
import com.xworkz.inheritence.internal.subject.Mathematics;

public class SubjectRunner {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.study();
        subject.exam();
        subject.difficulty();
        subject.syllabus();
        subject.knowledge();

        System.out.println("-----------");

        Subject subject2 = new Mathematics();
        subject2.study();
        subject2.exam();
        subject2.difficulty();
        subject2.syllabus();
        subject2.knowledge();

        System.out.println("-----------");

        Mathematics mathematics = new Mathematics();
        mathematics.study();
        mathematics.exam();
        mathematics.difficulty();
        mathematics.syllabus();
        mathematics.knowledge();
    }
}
