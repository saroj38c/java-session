package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class PredefinedDateFunction {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

    }
}
