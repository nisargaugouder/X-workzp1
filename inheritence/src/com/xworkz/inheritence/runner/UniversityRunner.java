package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.university.University;
import com.xworkz.inheritence.internal.university.Harvard;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new University();
        university.education();
        university.research();
        university.students();
        university.faculty();
        university.campus();

        System.out.println("-----------");

        University university2 = new Harvard();
        university2.education();
        university2.research();
        university2.students();
        university2.faculty();
        university2.campus();

        System.out.println("-----------");

        Harvard harvard = new Harvard();
        harvard.education();
        harvard.research();
        harvard.students();
        harvard.faculty();
        harvard.campus();
    }
}
