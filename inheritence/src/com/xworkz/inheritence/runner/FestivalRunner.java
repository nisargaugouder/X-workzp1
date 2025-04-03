package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.festival.Diwali;
import com.xworkz.inheritence.internal.festival.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival=new Diwali();
        festival.celebrate();
        festival.traditions();
        festival.holidays();
        festival.food();

        System.out.println("-----------");
        Diwali diwali = new Diwali();
        diwali.celebrate();
        diwali.traditions();
        diwali.holidays();
        diwali.food();
    }
}
