package com.yj.generic3;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i =10;
        Integer i2= (Integer)GenericMethod.objMethod(i);
        
        //타입 인자 (Type Arg) 
        System.out.println("명시적 타입인자전달");
        Integer i3=  GenericMethod.<Integer>genericMethod(i);
        Integer i4=  GenericMethod.<Integer>numberMethod(i);

        System.out.println("i4 = " + i4);
    }
}
