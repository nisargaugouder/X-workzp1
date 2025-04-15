package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.paste.ToothPaste;
import com.xworkz.application.inheritancetype.paste.GluePaste;

public class PasteRunner {
    public static void main(String[] args) {
        ToothPaste tooth = new ToothPaste();
        tooth.cleanTeeth();
        tooth.spread();

        GluePaste glue = new GluePaste();
        glue.stickPapers();
        glue.spread();
    }
}
