package classtasks.overload;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Message message1 = new Message();
        message1.printMessage(LocalDate.now());
        message1.printMessage(45);
        message1.printMessage("Hi");
//        message1.printMessage((Integer) null);

        message1.checkValue(null);
    }
}
