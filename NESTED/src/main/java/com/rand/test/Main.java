package com.rand.test;

public class Main {
    public static void main(String[] args) {

        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();

        innerClass.hello();
    }
}
