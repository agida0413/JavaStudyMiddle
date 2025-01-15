package com.rand.date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하세요 : ");
        int year = scanner.nextInt();

        System.out.println("월을 입력하세요 : ");
        int month = scanner.nextInt();





    }
    private static void printCalender(int year,int month){
        LocalDate firstDayMonth = LocalDate.of(year,month,1);
        LocalDate firstDayNextMonth = firstDayMonth.plusMonths(1);

        int offsetWeeks = firstDayMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa ");
    }
}
