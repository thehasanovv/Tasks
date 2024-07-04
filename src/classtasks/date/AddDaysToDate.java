package classtasks.date;

import java.time.LocalDate;

public class AddDaysToDate {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 7, 4);
        System.out.println("Daxil etdiyim tarix" + " " + startDate);
        int daysAdd = 15;
        System.out.println("------------------------");
        LocalDate newDate = startDate.plusDays(daysAdd);
        System.out.println("Neticede alinan tarix:" + " " + newDate);
    }
}