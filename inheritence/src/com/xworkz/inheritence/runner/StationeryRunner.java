package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.stationery.Pen;
import com.xworkz.inheritence.internal.stationery.Stationery;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery=new Pen();
        stationery.write();
        stationery.erase();
        stationery.color();
        stationery.size();

        System.out.println("-----------");
        Pen pen = new Pen();
        pen.write();
        pen.erase();
        pen.color();
        pen.size();
    }
}
