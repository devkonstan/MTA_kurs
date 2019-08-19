package others;

import java.time.LocalDate;
import java.time.Period;

public class DatesBetween {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate beforeMonth = LocalDate.now().minusMonths(1);

        Period period = Period.between(beforeMonth, now);
        System.out.println(period.getMonths());
    }
}
