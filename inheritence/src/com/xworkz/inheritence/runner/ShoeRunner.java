package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.shoe.Shoe;
import com.xworkz.inheritence.internal.shoe.SportsShoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe();
        shoe.protect();
        shoe.comfort();
        shoe.style();
        shoe.material();
        shoe.size();

        System.out.println("-----------");

        Shoe shoe2 = new SportsShoe();
        shoe2.protect();
        shoe2.comfort();
        shoe2.style();
        shoe2.material();
        shoe2.size();

        System.out.println("-----------");

        SportsShoe sportsShoe = new SportsShoe();
        sportsShoe.protect();
        sportsShoe.comfort();
        sportsShoe.style();
        sportsShoe.material();
        sportsShoe.size();
    }
}
