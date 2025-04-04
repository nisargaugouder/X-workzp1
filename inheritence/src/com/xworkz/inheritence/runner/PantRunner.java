package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.pant.Pant;
import com.xworkz.inheritence.internal.pant.JeansPant;

public class PantRunner {
    public static void main(String[] args) {
        Pant pant = new Pant();
        pant.wear();
        pant.fabric();
        pant.style();
        pant.comfort();
        pant.size();

        System.out.println("-----------");

        Pant pant2 = new JeansPant();
        pant2.wear();
        pant2.fabric();
        pant2.style();
        pant2.comfort();
        pant2.size();

        System.out.println("-----------");

        JeansPant jeansPant = new JeansPant();
        jeansPant.wear();
        jeansPant.fabric();
        jeansPant.style();
        jeansPant.comfort();
        jeansPant.size();
    }
}
