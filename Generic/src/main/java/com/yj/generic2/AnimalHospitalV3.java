package com.yj.generic2;

public class AnimalHospitalV3<T extends Animal>{
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        //T의 타입을 메서드를 정의하는 시점에는 알수없다 . Object 기능만 사용

        System.out.println("동물이름: "+animal.getName());
        System.out.println("동물크기: "+animal.getSize());

        animal.sound();
    }

    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal :target;
    }
}
