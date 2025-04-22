package com.xworkz.late.external.follow;

import com.xworkz.late.internal.people.Person;

public class Arun {
    private Person person;

    public Arun(Person person) {
        this.person = person;
    }

    public void doSomething() {
        System.out.println("Calling Arun to do something");
        if (this.person!=null){
            this.person.work();
        }
        else {
            System.out.println("eerr");
        }
    }
}
