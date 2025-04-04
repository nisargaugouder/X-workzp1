package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.mountain.Mountain;
import com.xworkz.inheritence.internal.mountain.Everest;

public class MountainRunner {
    public static void main(String[] args) {
        Mountain mountain = new Mountain();
        mountain.height();
        mountain.climate();
        mountain.location();
        mountain.trekking();
        mountain.wildlife();

        System.out.println("-----------");

        Mountain mountain2 = new Everest();
        mountain2.height();
        mountain2.climate();
        mountain2.location();
        mountain2.trekking();
        mountain2.wildlife();

        System.out.println("-----------");

        Everest everest = new Everest();
        everest.height();
        everest.climate();
        everest.location();
        everest.trekking();
        everest.wildlife();
    }
}
