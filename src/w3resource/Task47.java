package w3resource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task47 {
    public static void main(String[] args) {
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        String formattedDate = formatter.format(dateObj);

        System.out.println("Now: " + formattedDate);
    }
}
