package com.xworkz.assignment.internal.festival;

public class Festival {
    private String name;
    private int days;
    private String month;

    public Festival(String name, int days, String month) {
        this.name = name;
        this.days = days;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Festival{name=" + name + ", days=" + days + ", month=" + month + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FestivalHashCode:"+super.hashCode());
        return 542;
    }
}
