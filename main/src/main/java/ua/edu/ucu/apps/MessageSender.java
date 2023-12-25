package ua.edu.ucu.apps;

import ua.edu.ucu.apps.Adapters.*;

class MessageSender {
    public void send(String text, UserAdapter user, String country) {
        if (user.getCountry().equals(country) && user.getLastActiveTime() > System.currentTimeMillis() - 60 * 60 * 1000) {
            System.out.println("Sending message: " + text + " to user with email: " + user.getEmail());
        } else {
            System.out.println("User not eligible to receive the message.");
        }
    }
}