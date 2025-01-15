package com.rand.date;

import java.time.LocalDateTime;
import java.time.Period;

public class Test1 {
    
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2024,1,1,0,0,0);

       LocalDateTime answer=  localDateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("answer = " + answer);
    }
}
