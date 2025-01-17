package com.rand.EX;

public class OuterClass {
    
    private int value = 1;
    private static int staticValue = 5;
    public int g;
  
    static class InnerClass{

        private int value = 3;
       
        public void print(){

            System.out.println("staticValue = " + staticValue);
            System.out.println("value = " + value);


        }
    }
    
    public void print(){
        System.out.println("value = " + value);

    }
}
