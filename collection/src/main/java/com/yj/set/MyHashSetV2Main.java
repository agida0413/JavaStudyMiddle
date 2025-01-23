package com.yj.set;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 myHashSetV2 = new MyHashSetV2(10);
        myHashSetV2.add("A");
        myHashSetV2.add("B");
        myHashSetV2.add("C");
        myHashSetV2.add("D");
        myHashSetV2.add("ABS");
        myHashSetV2.add("SET");
        System.out.println("myHashSetV2 = " + myHashSetV2);
        
        boolean result = myHashSetV2.contains("SET");
        System.out.println("result = " + result);
        }
}
