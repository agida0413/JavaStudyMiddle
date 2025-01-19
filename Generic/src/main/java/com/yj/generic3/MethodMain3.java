package com.yj.generic3;

import com.yj.generic2.Cat;
import com.yj.generic2.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냥오이",100);

      ComplexBox<Dog> complexBox = new ComplexBox<>();
      complexBox.set(dog);

      Cat returnCat = complexBox.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
