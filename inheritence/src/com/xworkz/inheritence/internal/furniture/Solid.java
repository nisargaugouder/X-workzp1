package com.xworkz.inheritence.internal.furniture;

public class Solid {
    public void obj(Furniture furniture){
        furniture.design();
        furniture.move();
        furniture.material();
        furniture.support();
        furniture.weight();

        if(furniture instanceof Chair){
            System.out.println("furniture instanceof Chair");
            Chair chair=(Chair) furniture;

        }

    }
}
