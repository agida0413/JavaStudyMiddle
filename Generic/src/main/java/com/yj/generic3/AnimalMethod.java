package com.yj.generic3;

import com.yj.generic2.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkup(T animal){
        //T의 타입을 메서드를 정의하는 시점에는 알수없다 . Object 기능만 사용

        System.out.println("동물이름: "+animal.getName());
        System.out.println("동물크기: "+animal.getSize());

        animal.sound();
    }

    public static <T extends Animal> T bigger(T t1,T t2){
        return t1.getSize() > t2.getSize() ? t1 :t2;
    }
}
