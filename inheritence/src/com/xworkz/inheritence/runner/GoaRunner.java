package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.goa.Goa;
import com.xworkz.inheritence.internal.goa.NorthGoa;

public class GoaRunner {
    public static void main(String[] args) {
        Goa goa = new NorthGoa();
        goa.visitBeach();
        goa.enjoyNightlife();
        goa.exploreForts();
        goa.tasteSeafood();
        goa.relax();

        System.out.println("-----------------");
        NorthGoa northGoa = new NorthGoa();
        northGoa.visitBeach();
        northGoa.enjoyNightlife();
        northGoa.exploreForts();
        northGoa.tasteSeafood();
        northGoa.relax();
    }
}
