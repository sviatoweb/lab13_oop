package ua.edu.ucu.apps.Adapters;

import ua.edu.ucu.apps.FacebookUser;


public class FacebookUserAdapter implements UserAdapter {
    private final FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getUserEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public long getLastActiveTime() {
        return facebookUser.getLastActiveTime();
    }
}