package com.agilePro.services;

import com.agilePro.interfaces.Admin;

public class PrivateMessaging implements Admin {
    @Override
    public void manageMessages() {
        System.out.println("Private Messages have been sent...");
    }
}
