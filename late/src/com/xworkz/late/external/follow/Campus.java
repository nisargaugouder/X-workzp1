package com.xworkz.late.external.follow;

import com.xworkz.late.internal.college.College;

public class Campus {
    private College college;

    public Campus(College college) {
        this.college = college;
    }

    public void enter() {
        System.out.println("running enter in Campus");
        if (this.college != null) {
            this.college.study();
        } else {
            System.out.println("error");
        }
    }
}
