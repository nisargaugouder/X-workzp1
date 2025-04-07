package com.xworkz.inheritence.internal.bedsheet;

public class Color {
    public void select(Bedsheet bedsheet) {
        bedsheet.cover();
        bedsheet.fold();
        bedsheet.design();
        bedsheet.wash();
        bedsheet.texture();

        if(bedsheet instanceof CottonBedsheet){
            System.out.println("bedsheet instanceof CottonBedsheet");
            CottonBedsheet cottonBedsheet=(CottonBedsheet) bedsheet;
            cottonBedsheet.size();
        }

    }
}
