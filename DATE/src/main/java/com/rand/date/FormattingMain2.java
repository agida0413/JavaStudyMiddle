package com.rand.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포맷팅 : 날짜와 시간을 문자로

        LocalDateTime now = LocalDateTime.of(2023,1,3,14,30,59);
        DateTimeFormatter dateTimeFormatter  = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        String str = now.format(dateTimeFormatter);
        System.out.println("str = " + str);


        String dateTimeString = "2023-12-31 11:30:32";
       LocalDateTime localDateTime=  LocalDateTime.parse(dateTimeString,dateTimeFormatter);
        System.out.println("localDateTime = " + localDateTime);
    }
}
