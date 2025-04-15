package com.xworkz.application.inheritancetype.keychain;

public class Keychain extends Accessory {
    Key key = new Key();

    public void holdKeys() {
        key.unlock();
    }
}
