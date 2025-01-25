package com.yj.test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        String [][] produtArr = {{"Java","10000"},{"Spring","20000"},{"JPA","30000"}};

        Map<String,Integer> map =new HashMap<>();

        for (String[] product : produtArr) {
            String key = product[0];
            String value = product[1];
        }

    }
}
