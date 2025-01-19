package com.yj.generic2;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("냐옹이1",300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        dogHospital.set(cat); //다른타입 입력 컴파일오류가 안남


        dogHospital.set(dog);
        Dog bigger=  (Dog) dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("bigger = " + bigger);
    }
}
