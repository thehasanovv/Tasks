package classtasks.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {
        ZoneId zoneIdPlace = ZoneId.of("Europe/Berlin");
        ZonedDateTime zoneTime = ZonedDateTime.now(zoneIdPlace);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String formattedTime = formatter.format(zoneTime);
        System.out.println("Tarix ve zaman:" + " " + formattedTime);
    }
}