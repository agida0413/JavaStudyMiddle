package com.rand.EX2;

public class OuterClass {
    
    private int value = 10;

    public class InnerClass{
        
        public void print(){
            System.out.println("value = " + value);
        }
    }

    public void print(){
        System.out.println("value = " + value);
    }
}
