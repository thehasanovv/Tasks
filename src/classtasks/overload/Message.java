package classtasks.overload;

import java.time.LocalDate;

public class Message {
    public void printMessage(Integer num) {
        checkValue(num);
        System.out.println("Number is: " + num);
    }

    public void printMessage(String str) {
        checkValue(str);
        System.out.println("String is: " + str);
    }

    public void printMessage(LocalDate date) {
        checkValue(date);
        System.out.println("Date is: " + date);
    }

    public <T> void checkValue(T value) {
        if (value == null) {
            throw new RuntimeException("Value is empty");
        }
    }
}
