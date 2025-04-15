package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.animal.Animal;
import com.xworkz.application.inheritancetype.animal.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        animal.sound();
        dog.bark();

    }


}
