package com.rand.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30,59);

       LocalDateTime localDate= dt.with(ChronoField.YEAR,2020);
        System.out.println("dt = " + localDate);
        
        LocalDateTime dt3 = dt.withYear(2020);
        
        //다음주 금요일 
        
       LocalDateTime week= dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("week = " + week);
    
        
        //이번달의 마지막 일요일
      LocalDateTime localDateTime=  dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("localDateTime = " + localDateTime);
    }
}
