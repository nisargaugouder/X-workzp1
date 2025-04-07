package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.caboard.Caboard;
import com.xworkz.inheritence.internal.caboard.Door;
import com.xworkz.inheritence.internal.caboard.Lock;

public class CaboardRunner {
    public static void main(String[] args) {
        Caboard caboard1 = new Caboard();
        caboard1.lock();
        caboard1.key();
        caboard1.handle();
        caboard1.open();
        caboard1.close();

        System.out.println("-------------------");
        Caboard caboard = new Door();
        caboard.lock();
        caboard.key();
        caboard.handle();
        caboard.open();
        caboard.close();

        System.out.println("-------------------");
        Door door = new Door();
        door.lock();
        door.key();
        door.handle();
        door.open();
        door.close();

        System.out.println("-------- Casting Example ----------");
        Lock lock = new Lock();
        lock.secure(caboard);
        lock.secure(door);
        lock.secure(caboard1);
    }
}
