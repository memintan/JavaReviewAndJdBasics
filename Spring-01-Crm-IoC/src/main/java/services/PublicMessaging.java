package services;

import interfaces.Admin;

public class PublicMessaging implements Admin {
    @Override
    public void manageMessages() {
        System.out.println("Public Message has been sent...");
    }
}
