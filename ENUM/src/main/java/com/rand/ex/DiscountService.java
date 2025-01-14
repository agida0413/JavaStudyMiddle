package com.rand.ex;

public class DiscountService {

    public int discount(ClassGrade classGrade,int price){
        int discountPercent = 0 ;
        if(classGrade == ClassGrade.Basic){
        discountPercent = 10;
        } else if (classGrade ==ClassGrade.GOLD) {
            discountPercent =20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent =30;

        }else{
            System.out.println("할인 x ");
        }

        return price + discountPercent /100;
    }
}
