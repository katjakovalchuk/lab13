package lab13.lab13.src.main.java.ua.edu.ucu.apps.Task1;

public class Twitter implements User{
    private User user;

    public Twitter(User user) {
        this.user = user;
    }

    @Override
    public String getEmail() { 
        return user.getEmail();
    }

    @Override
    public String getUserCountry() {
        return user.getUserCountry();
    }

    @Override
    public long getUserActiveTime() {
        return user.getUserActiveTime();
    }
}
