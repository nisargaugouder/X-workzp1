package com.xworkz.inheritence.internal.caboard;

public class Lock {

    public void secure(Caboard caboard) {
        caboard.lock();
        caboard.key();
        caboard.handle();
        caboard.open();
        caboard.close();

        if(caboard instanceof Door) {
            Door door = (Door) caboard;
            door.knock();
        }
    }
}
