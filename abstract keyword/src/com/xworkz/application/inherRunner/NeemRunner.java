package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.neem.NeemPaste;
import com.xworkz.application.inheritancetype.neem.NeemSoap;

public class NeemRunner {
    public static void main(String[] args) {
        NeemPaste paste = new NeemPaste();
        paste.applyOnSkin();
        paste.naturalUse();

        NeemSoap soap = new NeemSoap();
        soap.useForBath();
        soap.naturalUse();
    }
}
