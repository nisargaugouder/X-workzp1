package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.cake.Cake;

public class CakeRunner {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.taste();
        cake.sweet();
        cake.slice();
    }
}
