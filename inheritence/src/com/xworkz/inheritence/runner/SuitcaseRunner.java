package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.suitcase.Suitcase;
import com.xworkz.inheritence.internal.suitcase.Zip;

public class SuitcaseRunner {
    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase();
        suitcase.open();
        suitcase.close();
        suitcase.color();
        suitcase.size();
        suitcase.lock();

        System.out.println("-----------");

        Suitcase suitcase2 = new Zip();
        suitcase2.open();
        suitcase2.close();
        suitcase2.color();
        suitcase2.size();
        suitcase2.lock();

        System.out.println("-----------");

        Zip zip = new Zip();
        zip.open();
        zip.close();
        zip.color();
        zip.size();
        zip.lock();
    }
}
