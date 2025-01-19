package com.yj.generic3;

import com.yj.generic2.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public <T> T printAndReturn(T z){
        System.out.println("animal.className= "+animal.getClass().getName());
        System.out.println("t.classNme:"+z.getClass().getName());
        return z;
    }
}
