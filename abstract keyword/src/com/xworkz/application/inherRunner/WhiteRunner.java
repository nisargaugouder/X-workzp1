package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.white.WhiteLight;
import com.xworkz.application.inheritancetype.white.WhitePaint;

public class WhiteRunner {
    public static void main(String[] args) {
        WhiteLight light = new WhiteLight();
        light.illuminate();
        light.reflectLight();

        WhitePaint paint = new WhitePaint();
        paint.applyToWall();
        paint.reflectLight();
    }
}
