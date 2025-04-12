package com.xworkz.assignment.internal.broom;

public class Broom {
    private int length;
    private String size;
    private String use;

    public Broom(int length,String size,String use){
        this.length=length;
        this.size=size;
        this.use=use;
    }

    @Override
    public String toString() {
        return
                "length=" + length +
                ", size='" + size +
                ", use= " + use;
    }

    @Override
    public int hashCode() {
        System.out.println("BroomHashCode:"+super.hashCode());
        return 74;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Broom){
                System.out.println("have ref.will compare..");
                Broom broom1=this;
                Broom broom2=(Broom) obj;
                if(broom1.use.equals(broom2.use)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
