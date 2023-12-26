package lab13.lab13.src.main.java.ua.edu.ucu.apps.Task1;

public class MessageSender {
    public void sendMessage(String message, User user) {
        System.out.println("Sending message to " + user.getEmail() + ": " + message);
    }
}
