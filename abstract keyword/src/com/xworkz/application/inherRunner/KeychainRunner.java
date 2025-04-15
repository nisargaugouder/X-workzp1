package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.keychain.Keychain;

public class KeychainRunner {
    public static void main(String[] args) {
        Keychain keychain = new Keychain();
        keychain.holdKeys();
        keychain.decorate();
    }
}
