package com.yj.javaSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Integer [] inputArr = {30,20,20,10,10};
        
        
        //코드작성

        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < inputArr.length; i++) {
           integers.add(inputArr[i]);
        }

        System.out.println("integers = " + integers);
    }
}
