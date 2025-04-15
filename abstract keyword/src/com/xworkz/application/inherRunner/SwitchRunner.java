package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.switchs.Switch;

public class SwitchRunner {
    public static void main(String[] args) {
        Switch sw = new Switch();
        sw.power();
        sw.circuit();
        sw.toggle();
    }
}
