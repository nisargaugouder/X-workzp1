package com.xworkz.assignment.internal.sports;

public class Sports {
    private String name;
    private int players;
    private String type;

    public Sports(String name, int players, String type) {
        this.name = name;
        this.players = players;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", players=" + players +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SportHashCode:"+super.hashCode());
        return 36;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Sports){
                System.out.println("obj instance of class");
                Sports sports1=this;
                Sports sports2=(Sports) obj;
                if(sports1.name.equals(sports2.name) && sports2.type.equals(sports1.type) && sports1.players==sports2.players){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
