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

    @Override
    public int hashCode() {
        System.out.println("UniHashCode:"+super.hashCode());
        return 412;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof University){
                System.out.println("obj instance of class");
                University university1=this;
                University university2=(University) obj;
                if(university1.establishedYear==university2.establishedYear && university1.name.equals(university2.name) && university1.location.equals(university2.location)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
