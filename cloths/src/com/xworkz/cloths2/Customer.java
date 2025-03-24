package com.xworkz.cloths2;

import com.xworkz.cloths.Cloth;

public class Customer {
    public void cloth(){
        Cloth cloth=new Cloth();
        System.out.println("running cloth in customer");
        cloth.color();
    }
}
