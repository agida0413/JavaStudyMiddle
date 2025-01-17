package com.rand.anonymous;

import java.util.Random;

public class Ex1MainV2 {
    public static void helloDice(){
        System.out.println("프로그램 시작");

        //코드 조각 시작
        int randomValue = new Random().nextInt(6)+1;
        System.out.println("주사위="+randomValue);

        System.out.println("프로그램 종료");
    }

    public static void helloSum(){
        System.out.println("프로그램 시작");

        for (int i = 0; i < 3; i++) {
            System.out.println("i ="+i);
        }
        System.out.println("프로그램 종료");
    }

    public static void helloAction(HelloDo helloDo){
        System.out.println("프로그램 시작");
        helloDo.action();
        System.out.println("프로그램 종료");

    }



    public static void main(String[] args) {

        helloAction(()->{
            int randomValue = new Random().nextInt(6)+1;
            System.out.println("주사위="+randomValue);
        });

        helloAction(()->{
            for (int i = 0; i < 3; i++) {
                System.out.println("i ="+i);
            }
        });

    }
}
