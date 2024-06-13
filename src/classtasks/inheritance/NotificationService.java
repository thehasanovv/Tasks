package classtasks.inheritance;

public class NotificationService {
    private MessageSender messageSender ;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notify(String message) {
        messageSender.sendMessage(message);
    }
}