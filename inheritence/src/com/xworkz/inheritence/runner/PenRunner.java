package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.pen.Pen;
import com.xworkz.inheritence.internal.pen.BallPen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.write();
        pen.inkFlow();
        pen.cap();
        pen.refill();
        pen.grip();

        System.out.println("-----------");

        Pen pen2 = new BallPen();
        pen2.write();
        pen2.inkFlow();
        pen2.cap();
        pen2.refill();
        pen2.grip();

        System.out.println("-----------");

        BallPen ballPen = new BallPen();
        ballPen.write();
        ballPen.inkFlow();
        ballPen.cap();
        ballPen.refill();
        ballPen.grip();
    }
}
