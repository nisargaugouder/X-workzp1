package com.xworkz.inheritence.internal.bed;

public class Cotton {
    public void madeOf(Bed bed){
        bed.adjust();
        bed.comfort();
        bed.fold();
        bed.sleep();
        bed.decorate();

        if(bed instanceof KingSizeBed){
            System.out.println("bed instanceof KingSizeBed");
            KingSizeBed kingSizeBed=(KingSizeBed) bed;
            kingSizeBed.big();
        }
    }
}
