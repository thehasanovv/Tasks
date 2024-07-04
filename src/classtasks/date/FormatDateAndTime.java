package classtasks.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateAndTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");


        String formatDate1 = now.format(formatter1);
        String formatDate2 = now.format(formatter2);
        String formatDate3 = now.format(formatter3);

        System.out.println("First" + " " + formatDate1);
        System.out.println("Second" + " " + formatDate2);
        System.out.println("Third" + " " + formatDate3);


    }
}