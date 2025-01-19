package com.yj.generic4;

import com.yj.generic2.Cat;
import com.yj.generic2.Dog;

public class WildCardMain2 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));
        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printGenericV2(dogBox);
        Dog dog = WildCardEx.printAndReturnGeneriv(dogBox);


    }
}
