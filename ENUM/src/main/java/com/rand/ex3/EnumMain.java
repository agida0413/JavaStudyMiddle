package com.rand.ex3;

import com.rand.ex2.Grade;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();

        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("value = " + value);
        }
        
        String input= "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);



    }
}
