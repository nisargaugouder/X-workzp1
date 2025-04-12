package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.element.Element;

public class ElementRunner {
    public static void main(String[] args) {
        Element element = new Element("Hydrogen", "H", 1);
        System.out.println(element);
        System.out.println(element.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(element));

        Element element1 = new Element("Hydrogen", "H", 1);
        Element element2 = new Element("Hydrogen", "H", 1);

        boolean same = element1.equals(element2);
        System.out.println("same:" + same);
    }
}
