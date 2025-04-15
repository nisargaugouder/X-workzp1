package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.paint.Paint;

public class PaintRunner {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.prepare();
        paint.mix();
        paint.apply();
    }
}
