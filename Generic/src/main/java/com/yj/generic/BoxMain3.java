package com.yj.generic;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> genericBox1 = new GenericBox<>();
        genericBox1.set(10);
        System.out.println("genericBox1.get() = " + genericBox1.get());

        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("문자");
        System.out.println("genericBox.get() = " + genericBox.get()) ;
    }
}
