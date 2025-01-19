package com.yj.generic4;

import com.yj.generic2.Animal;
import com.yj.generic2.Dog;

public class WildCardEx {

    static <T> void printGenericV1(Box<T> box){
        System.out.println("T="+box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t =box.get();
        System.out.println("이름 = " + t.getName());
    }

   static <T extends Animal> T printAndReturnGeneriv(Box<T> box){
          T t = box.get();
          System.out.println("이름 = " + t.getName());
          return t;
   }

   static void prinntWildCardV1(Box<?> box){
       System.out.println("?="+box.get());
   }


    static void prinntWildCardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }


    static Animal printAndReturnGeneriv2(Box<? extends Animal> box){

        Animal t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    //? 가 Animal 타입보다 높은타입이여야함.
    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("멍멍이",100));
    }
}
