package com.xworkz.inheritence.internal.doll;

public class ToyBox {

    public void display(Doll doll) {
        doll.play();
        doll.dress();
        doll.talk();
        doll.move();
        doll.collect();

        if(doll instanceof BarbieDoll) {
            System.out.println("doll instanceof BarbieDoll");
            BarbieDoll barbie = (BarbieDoll) doll;
            barbie.hairstyle();
        }
    }
}
