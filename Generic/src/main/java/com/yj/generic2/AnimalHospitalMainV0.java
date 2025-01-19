package com.yj.generic2;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();
        
        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("냐옹이1",300);
        
        dogHospital.set(dog);
        dogHospital.checkup();
        
        catHospital.set(cat);
        catHospital.checkup();
        
//        dogHospital.set(cat); 다른타입 입력 컴파일오류 
        
        
        dogHospital.set(dog);
      Dog bigger=  dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("bigger = " + bigger);
    }
}
