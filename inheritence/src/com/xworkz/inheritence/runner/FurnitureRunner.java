package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.furniture.Furniture;
import com.xworkz.inheritence.internal.furniture.Chair;
import com.xworkz.inheritence.internal.furniture.Solid;

import java.awt.*;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture();
        furniture.support();
        furniture.material();
        furniture.weight();
        furniture.move();
        furniture.design();

        System.out.println("-----------");

        Furniture furniture2 = new Chair();
        furniture2.support();
        furniture2.material();
        furniture2.weight();
        furniture2.move();
        furniture2.design();

        System.out.println("-----------");

        Chair chair = new Chair();
        chair.support();
        chair.material();
        chair.weight();
        chair.move();
        chair.design();

        System.out.println("-------casting");
        Solid solid=new Solid();
        solid.obj(furniture);
        solid.obj(furniture2);
        solid.obj(chair);
    }
}
