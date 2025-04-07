package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.lock.Key;
import com.xworkz.inheritence.internal.lock.Lock;

public class KeyRunner {
    public static void main(String[] args) {
        Key key = new Key();
        key.big();
        key.close();
        key.open();
        key.white();
        key.small();

        System.out.println("-----------");

        Key key2 = new Lock();
        key2.big();
        key2.close();
        key2.open();
        key2.white();

        key2.small();

        System.out.println("-----------");

        Lock lock = new Lock();
        lock.big();
        lock.close();
        lock.open();
        lock.white();
        lock.small();


        System.out.println("---------casting");
    }
}
