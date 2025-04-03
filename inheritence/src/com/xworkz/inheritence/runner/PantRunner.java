package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.pant.Pant;
import com.xworkz.inheritence.internal.pant.JeansPant;

public class PantRunner {
    public static void main(String[] args) {
        Pant pant = new JeansPant();
        pant.wear();
        pant.madeOfFabric();
        pant.availableInDifferentStyles();
        pant.provideComfort();
        pant.comesInVariousSizes();

        System.out.println("-----------------");
        JeansPant jeansPant = new JeansPant();
        jeansPant.wear();
        jeansPant.madeOfFabric();
        jeansPant.availableInDifferentStyles();
        jeansPant.provideComfort();
        jeansPant.comesInVariousSizes();
    }
}
