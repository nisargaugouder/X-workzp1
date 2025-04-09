package com.xworkz.assignment.internal.university;

public class University {
    private String name;
    private String location;
    private int establishedYear;

    public University(String name, String location, int establishedYear) {
        this.name = name;
        this.location = location;
        this.establishedYear = establishedYear;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", establishedYear=" + establishedYear +
                '}';
    }
}
