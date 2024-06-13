package classtasks.inheritance;

public class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.notify("This is an email notification!");

        MessageSender smsSender = new SmsSender();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.notify("This is an SMS notification!");
    }
}
