package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.heart.Heart;

public class HeartRunner {
    public static void main(String[] args) {
        Heart heart = new Heart(72, "Normal", true);
        System.out.println(heart);
    }
}
