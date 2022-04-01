package day6;

import java.util.Calendar;

public class DateCalendar {
    public static void main(String[] args) {
        //Set Specific Date
        Calendar setBirthday = Calendar.getInstance();
        setBirthday.set(Calendar.YEAR, 1995);
        setBirthday.set(Calendar.MONTH, 8);
        setBirthday.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println(setBirthday);
    }

}
