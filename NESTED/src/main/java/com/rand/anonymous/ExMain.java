package com.rand.anonymous;

public class ExMain {

    public static void hellOjava(){
        System.out.println("프로그램시작");
        System.out.println("HELLO JAVA");
        System.out.println("프로그램종료");
    }

    public static void hellOSpring(){
        System.out.println("프로그램시작");
        System.out.println("HELLO SPRING");
        System.out.println("프로그램종료");
    }

    public static void helloWorld(String str){
        System.out.println("프로그램시작");


       Hello hello= new Hello(){
            @Override
            public void hello() {
                System.out.println("HELLO" + str);
            }
        };
       hello.hello();
        System.out.println("프로그램종료");
    }


    public static void main(String[] args) {
        helloWorld("JAVA");
        helloWorld("SPRING");
    }
}
