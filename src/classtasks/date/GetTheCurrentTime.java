package classtasks.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetTheCurrentTime {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formatTime = timeFormatter.format(currentTime);
        System.out.println("Current time:" + " " + formatTime);
    }
}