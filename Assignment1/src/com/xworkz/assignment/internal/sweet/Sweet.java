package com.xworkz.assignment.internal.sweet;

public class Sweet {
    private String name;
    private String origin;
    private boolean isSugarFree;

    public Sweet(String name, String origin, boolean isSugarFree) {
        this.name = name;
        this.origin = origin;
        this.isSugarFree = isSugarFree;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", isSugarFree=" + isSugarFree +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SweetHashCode:"+super.hashCode());
        return 54;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Sweet){
                System.out.println("obj instance of class");
                Sweet sweet1=this;
                Sweet sweet2=(Sweet) obj;
                if(sweet1.isSugarFree==sweet2.isSugarFree && sweet1.name.equals(sweet2.name) && sweet1.origin.equals(sweet2.origin)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
