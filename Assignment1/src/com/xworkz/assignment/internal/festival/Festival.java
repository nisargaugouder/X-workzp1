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

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Festival){
                System.out.println("have ref.will compare..");
                Festival festival1=this;
                Festival festival2=(Festival) obj;
                if(festival1.days==festival2.days && festival1.name.equals(festival2.name)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
