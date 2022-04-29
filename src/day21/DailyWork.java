package day21;

import java.util.EnumSet;

import static day21.WeekDay.MONDAY;

public class DailyWork {
    public static void main(String[] args) {
//        ArrayList<Day> days = new ArrayList<>();
//        days.add(Day.MONDAY);
//        days.add(Day.TUESDAY);
//        days.add(Day.WEDNESDAY);
//        days.add(Day.THURSDAY);
//        days.add(Day.FRIDAY);
//        days.add(Day.SATURDAY);
//        days.add(Day.SUNDAY);

//        System.out.println(days);
        int weekDay = 0;


        if (weekDay == MONDAY.getAbbr()) {
            System.out.println("Shop is open");
        }

        EnumSet<WeekDay> allDays = EnumSet.allOf(WeekDay.class);
        System.out.println(allDays);

        EnumSet<WeekDay> nonDays = EnumSet.noneOf(WeekDay.class);
        System.out.println(nonDays);

        EnumSet<WeekDay> rangeDay = EnumSet.range(MONDAY, WeekDay.FRIDAY);
        System.out.println(rangeDay);

        EnumSet<WeekDay> specificDay = EnumSet.of(WeekDay.SUNDAY);
        System.out.println(specificDay);

        EnumSet<WeekDay> specificMultipleDay = EnumSet.of(MONDAY, WeekDay.WEDNESDAY, WeekDay.FRIDAY);
        System.out.println(specificMultipleDay);
    }
}
