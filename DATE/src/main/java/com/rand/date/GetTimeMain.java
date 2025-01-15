package com.rand.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023,1,1,13,30,59);
        System.out.println("Year = " + localDateTime.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("day_of_month = " + localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = " + localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = " + localDateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE = " + localDateTime.get(ChronoField.SECOND_OF_MINUTE));


        System.out.println("Year = " + localDateTime.getYear());
        System.out.println("MONTH_OF_YEAR = " + localDateTime.getMonthValue());
        System.out.println("day_of_month = " + localDateTime.getDayOfMonth());
        System.out.println("HOUR_OF_DAY = " + localDateTime.getHour());
        System.out.println("MINUTE_OF_HOUR = " + localDateTime.getMinute());
        System.out.println("SECOND_OF_MINUTE = " + localDateTime.getSecond());


    }
}
