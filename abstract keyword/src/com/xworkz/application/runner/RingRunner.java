package com.xworkz.application.runner;

import com.xworkz.application.internal.ring.Circle;
import com.xworkz.application.internal.ring.Ring;

public class RingRunner {
    public static void main(String[] args) {
        Ring r1=new Circle("wear",4,40000,"gold");
        Ring r2=new Circle("wear",5);
        Ring r3=new Circle(1200,"silver");
    }
}
