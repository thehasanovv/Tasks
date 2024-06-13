package classtasks.inheritance;

public class EmailSender extends MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email with message: " + message);
    }
}