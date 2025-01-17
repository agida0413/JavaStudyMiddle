package com.rand.test;

public class OuterClass1 {
    static class InnerClass{
        public void hello(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        //hello 메소드 호출
        OuterClass1.InnerClass innerClass = new OuterClass1.InnerClass();
        innerClass.hello();
    }
}
