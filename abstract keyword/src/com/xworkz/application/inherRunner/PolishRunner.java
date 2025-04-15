package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.polish.LipPolish;
import com.xworkz.application.inheritancetype.polish.NailPolish;

public class PolishRunner {
    public static void main(String[] args) {
        LipPolish lip = new LipPolish();
        lip.moisturize();
        lip.shine();

        NailPolish nail = new NailPolish();
        nail.colorNails();
        nail.shine();
    }
}
