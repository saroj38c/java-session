package day6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateCalendar {
    public static void main(String[] args) {
        //Set Specific Date
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 1995);
        dateOfBirth.set(Calendar.MONTH, 8);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 15);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        System.out.println(dateFormat.format(dateOfBirth.getTime()));
    }

}
