package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.goa.Dream;
import com.xworkz.inheritence.internal.goa.Goa;
import com.xworkz.inheritence.internal.goa.NorthGoa;

public class GoaRunner {
    public static void main(String[] args) {
        Goa goa = new Goa();
        goa.beach();
        goa.nightlife();
        goa.forts();
        goa.seafood();
        goa.relax();

        System.out.println("-----------");

        Goa goa2 = new NorthGoa();
        goa2.beach();
        goa2.nightlife();
        goa2.forts();
        goa2.seafood();
        goa2.relax();

        System.out.println("-----------");

        NorthGoa northGoa = new NorthGoa();
        northGoa.beach();
        northGoa.nightlife();
        northGoa.forts();
        northGoa.seafood();
        northGoa.relax();

        System.out.println("---------casting");
        Dream dream=new Dream();
        dream.baga(goa);
        dream.baga(goa2);
        dream.baga(northGoa);
    }
}
