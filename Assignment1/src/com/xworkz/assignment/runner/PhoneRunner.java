package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.phone.Phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", "iPhone 13", 79999.0);
        System.out.println(phone);
        System.out.println(phone.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(phone));
    }
}
