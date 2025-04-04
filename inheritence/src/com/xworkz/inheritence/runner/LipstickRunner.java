package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.lipstick.Lipstick;
import com.xworkz.inheritence.internal.lipstick.MatteLipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick();
        lipstick.color();
        lipstick.shades();
        lipstick.texture();
        lipstick.beauty();
        lipstick.makeup();

        System.out.println("-----------");

        Lipstick lipstick2 = new MatteLipstick();
        lipstick2.color();
        lipstick2.shades();
        lipstick2.texture();
        lipstick2.beauty();
        lipstick2.makeup();

        System.out.println("-----------");

        MatteLipstick matteLipstick = new MatteLipstick();
        matteLipstick.color();
        matteLipstick.shades();
        matteLipstick.texture();
        matteLipstick.beauty();
        matteLipstick.makeup();
    }
}
