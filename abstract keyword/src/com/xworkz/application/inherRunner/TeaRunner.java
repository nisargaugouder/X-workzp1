package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.tea.Tea;
import com.xworkz.application.inheritancetype.tea.GreenTea;

public class TeaRunner {
    public static void main(String[] args) {
        Tea tea = new Tea();
        GreenTea green = new GreenTea();

        tea.sip();
        green.detox();
        green.sip();
    }
}
