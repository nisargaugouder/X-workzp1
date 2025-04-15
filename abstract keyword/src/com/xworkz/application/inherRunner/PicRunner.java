package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.pic.Pic;

public class PicRunner {
    public static void main(String[] args) {
        Pic pic = new Pic();
        pic.save();
        pic.edit();
        pic.share();
    }
}
