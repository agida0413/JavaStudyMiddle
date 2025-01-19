package com.yj.generic;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        
        objectBox.set(10);
        Object o= objectBox.get();
    
        Integer i = (Integer)o;
        System.out.println("i = " + i);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hell");
        String str = (String)stringBox.get();

        System.out.println("str = " + str);
    }
}
