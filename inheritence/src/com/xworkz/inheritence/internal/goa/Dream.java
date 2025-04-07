package com.xworkz.inheritence.internal.goa;

public class Dream {
    public void baga(Goa goa){
        goa.beach();
        goa.forts();
        goa.nightlife();
        goa.seafood();
        goa.relax();

        if(goa instanceof NorthGoa){
            System.out.println("goa instanceof NorthGoa");
            NorthGoa northGoa=(NorthGoa) goa;
            northGoa.place();
        }
    }
}
