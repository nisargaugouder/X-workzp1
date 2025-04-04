package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.stationery.Stationery;
import com.xworkz.inheritence.internal.stationery.Pen;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery = new Stationery();
        stationery.write();
        stationery.erase();
        stationery.color();
        stationery.size();
        stationery.price();

        System.out.println("-----------");

        Stationery stationery2 = new Pen();
        stationery2.write();
        stationery2.erase();
        stationery2.color();
        stationery2.size();
        stationery2.price();

        System.out.println("-----------");

        Pen pen = new Pen();
        pen.write();
        pen.erase();
        pen.color();
        pen.size();
        pen.price();
    }
}
