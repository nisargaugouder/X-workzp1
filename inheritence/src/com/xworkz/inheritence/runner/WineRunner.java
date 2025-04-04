package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.wine.Wine;
import com.xworkz.inheritence.internal.wine.RedWine;

public class WineRunner {
    public static void main(String[] args) {
        Wine wine = new Wine();
        wine.grapes();
        wine.alcohol();
        wine.aging();
        wine.serve();
        wine.cooking();

        System.out.println("-----------");

        Wine wine2 = new RedWine();
        wine2.grapes();
        wine2.alcohol();
        wine2.aging();
        wine2.serve();
        wine2.cooking();

        System.out.println("-----------");

        RedWine redWine = new RedWine();
        redWine.grapes();
        redWine.alcohol();
        redWine.aging();
        redWine.serve();
        redWine.cooking();
    }
}
