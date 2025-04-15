package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.phone.Phone;
import com.xworkz.application.inheritancetype.phone.SmartPhone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone();
        SmartPhone smart = new SmartPhone();

        phone.call();
        smart.browse();
        smart.call();
    }
}
