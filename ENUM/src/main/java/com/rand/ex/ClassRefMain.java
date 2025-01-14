package com.rand.ex;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("class Basic = "+ClassGrade.Basic.getClass());
        System.out.println("class GOLD = "+ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = "+ClassGrade.DIAMOND.getClass());


        System.out.println("ref BASIC = " + ClassGrade.Basic);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);


        DiscountService discountService = new DiscountService();

        int price = 1000;
        discountService.discount(ClassGrade.Basic,price);
        discountService.discount(ClassGrade.DIAMOND,price);
        discountService.discount(ClassGrade.GOLD,price);

    }
}
