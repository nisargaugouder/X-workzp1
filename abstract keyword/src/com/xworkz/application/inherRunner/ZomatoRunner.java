package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.zomato.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        Zomato zomato = new Zomato();
        zomato.launch();
        zomato.browseRestaurants();
        zomato.orderFood();
    }
}
