package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.church.Church;

public class ChurchRunner {
    public static void main(String[] args) {
        Church church = new Church("St. Mary's", "Bangalore", 500);
        System.out.println(church);
    }
}
