package com.rand.EX2;

public class NestedInnerMain {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.print();

    }
}
