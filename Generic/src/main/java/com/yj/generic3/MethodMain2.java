package com.yj.generic3;

import com.yj.generic2.Cat;
import com.yj.generic2.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냥오이",100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);
       
        Dog dog1 =  AnimalMethod.bigger(dog, new Dog("큰 멍멍이",200));
        System.out.println("dog1 = " + dog1);
    }
}
