package com.rand.date;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        //ChronoField - > 특정날짜에서 값을 꺼낼떄
        //ChronoUnit - > 시간과 관련된 단위 그자체
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30,59);

      LocalDateTime dt2=   dt.plus(10,ChronoUnit.YEARS);
       LocalDateTime dt3 = dt.plusYears(10);

        Period period = Period.ofYears(10);
        LocalDateTime dt4 = dt.plus(period);

        TimeUnit timeUnit = TimeUnit.DAYS;

        LocalDateTime localDateTime = LocalDateTime.now();
        
    long sec=    ChronoUnit.DAYS.between(dt,localDateTime);
        System.out.println("sec = " + sec);

    }
}
