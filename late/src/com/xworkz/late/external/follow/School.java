package com.xworkz.late.external.follow;

import com.xworkz.late.internal.teacher.Teacher;

public class School {
    private Teacher teacher;

    public School(Teacher teacher) {
        this.teacher = teacher;
    }

    public void startClass() {
        System.out.println("Running startClass in School");
        if (this.teacher != null) {
            this.teacher.teach();
        } else {
            System.out.println("error");
        }
    }
}
