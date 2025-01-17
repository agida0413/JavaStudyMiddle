package com.rand.EX;

public class StaticNestedClass {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        innerClass.print();
        outerClass.print();
    }
}
