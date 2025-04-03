package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.pen.Pen;
import com.xworkz.inheritence.internal.pen.BallPen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new BallPen();
        pen.write();
        pen.inkFlow();
        pen.cap();
        pen.refill();

        System.out.println("-----------------");
        BallPen ballPen = new BallPen();
        ballPen.write();
        ballPen.inkFlow();
        ballPen.cap();
        ballPen.refill();
    }
}
