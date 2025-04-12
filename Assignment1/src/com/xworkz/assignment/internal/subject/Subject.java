package com.xworkz.assignment.internal.subject;

public class Subject {
    private String name;
    private int marks;
    private String teacher;

    public Subject(String name, int marks, String teacher) {
        this.name = name;
        this.marks = marks;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SubjectHashCode:"+super.hashCode());
        return 8;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Subject){
                System.out.println("obj instance of class");
                Subject subject1=this;
                Subject subject2=(Subject) obj;
                if(subject1.marks==subject2.marks && subject1.name.equals(subject2.name) && subject1.teacher.equals(subject2.teacher)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
