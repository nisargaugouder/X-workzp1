package com.xworkz.inheritence.internal.color;

public class ColorShop {

    public void purchase(Color color) {
        color.display();
        color.mix();
        color.brighten();
        color.fade();

        if(color instanceof Red) {
            System.out.println("color instanceof Red");
            Red red = (Red) color;
            red.shade();
        }
    }
}
