package com.rand.test;

public class AnonyMain {
    public static void main(String[] args) {
      Hello hello=  new Hello(){
            @Override
            public void hello() {
                System.out.println("heeeellllooo");
            }
        };

      hello.hello();
    }
}
