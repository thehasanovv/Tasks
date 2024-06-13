package classtasks.inheritance;

public class SmsSender extends MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}