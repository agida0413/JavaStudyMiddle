package com.rand.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.util.concurrent.TimeUnit;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2024,04,13);
        LocalDate now = LocalDate.now();

        
        Period period =   Period.between(localDate,now);

        System.out.println("period.getMonths() = " + period.getMonths());
        System.out.println("period.getMonths() = " + period.getDays());
    }
}
