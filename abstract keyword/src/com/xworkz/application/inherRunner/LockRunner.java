package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.lock.Lock;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new Lock();
        lock.secure();
        lock.protect();
    }
}
