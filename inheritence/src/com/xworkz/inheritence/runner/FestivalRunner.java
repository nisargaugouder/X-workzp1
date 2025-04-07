package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.festival.Diwali;
import com.xworkz.inheritence.internal.festival.Festival;
import com.xworkz.inheritence.internal.festival.Hindu;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival = new Festival();
        festival.celebrate();
        festival.traditions();
        festival.holidays();
        festival.food();
        festival.gathering();

        System.out.println("-----------");

        Festival diwaliRef = new Diwali();
        diwaliRef.celebrate();
        diwaliRef.traditions();
        diwaliRef.holidays();
        diwaliRef.food();
        diwaliRef.gathering();

        System.out.println("-----------");

        Diwali diwali = new Diwali();
        diwali.celebrate();
        diwali.traditions();
        diwali.holidays();
        diwali.food();
        diwali.gathering();

        System.out.println("----------casting");
        Hindu hindu=new Hindu();
        hindu.celebrate(festival);
        hindu.celebrate(diwali);
        hindu.celebrate(diwaliRef);
    }
}
