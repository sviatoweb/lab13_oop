package ua.edu.ucu.apps;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TwitterUser {
    private String userEmail;
    private String country;
    private long lastActiveTime;

    public TwitterUser(String userEmail, String country, long lastActiveTime) {
        this.userEmail = userEmail;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }
}