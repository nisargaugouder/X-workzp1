package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.banana.Banana;
import com.xworkz.application.inheritancetype.banana.RawBanana;

public class BananaRunner {
    public static void main(String[] args) {
        Banana banana = new Banana();
        RawBanana raw = new RawBanana();

        banana.eat();
        raw.cook();
        raw.eat();
    }
}
