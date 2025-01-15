package com.rand.date;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {
        //포매팅 : 날짜를 문자로 

        LocalDate localDate = LocalDate.of(2024,12,31);
        System.out.println("localDate = " + localDate);
        DateTimeFormatter dateTimeFormatter=  DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
    
        String str = localDate.format(dateTimeFormatter);
        System.out.println("str = " + str);
        
        //파싱 : 문자를 날짜로 
        
        String input = "2030년 01월 01일";
        LocalDate localDate1=  LocalDate.parse(input,dateTimeFormatter);
        System.out.println("localDate1 = " + localDate1);


    }
}
