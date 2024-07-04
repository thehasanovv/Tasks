package classtasks.date;

import java.time.LocalDate;
import java.time.Period;

public class CalculateTheDifferenceBetweenTwoDates {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(1998, 11, 5);
        LocalDate endDate = LocalDate.of(2000, 11, 27);

        Period period = Period.between(startDate, endDate);

        System.out.printf("Iki tarix arasindaki ferq %d il %d ay %d gwn",
                period.getYears(), period.getMonths(), period.getDays());
    }
}
