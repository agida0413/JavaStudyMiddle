package com.rand.ex2;

import static com.rand.ex2.Grade.*;

public class DiscountService {

    public int discount(Grade classGrade, int price){
        int discountPercent = 0 ;
        if(classGrade == BASIC){
        discountPercent = 10;
        } else if (classGrade ==GOLD) {
            discountPercent =20;
        } else if (classGrade == DIAMOND) {
            discountPercent =30;

        }else{
            System.out.println("할인 x ");
        }

        return price + discountPercent /100;
    }
}
