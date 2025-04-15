package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.mat.Mat;
import com.xworkz.application.inheritancetype.mat.YogaMat;

public class MatRunner {
    public static void main(String[] args) {
        Mat mat = new Mat();
        YogaMat yoga = new YogaMat();

        mat.sitOn();
        yoga.stretchOn();
        yoga.sitOn();
    }
}
