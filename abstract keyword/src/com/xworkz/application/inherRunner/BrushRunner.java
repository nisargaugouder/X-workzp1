package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.brush.Brush;
import com.xworkz.application.inheritancetype.brush.ElectricBrush;

public class BrushRunner {
    public static void main(String[] args) {
        Brush brush = new Brush();
        ElectricBrush eBrush = new ElectricBrush();

        brush.cleanTeeth();
        eBrush.vibrate();
        eBrush.cleanTeeth();
    }
}
