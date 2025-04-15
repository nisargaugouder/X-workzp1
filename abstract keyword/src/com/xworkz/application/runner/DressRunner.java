package com.xworkz.application.runner;

import com.xworkz.application.internal.dress.Dress;
import com.xworkz.application.internal.dress.Jeans;

public class DressRunner {
    public static void main(String[] args) {
        Dress dress=new Jeans();
        dress.wear();
    }
}
