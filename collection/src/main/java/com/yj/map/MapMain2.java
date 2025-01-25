package com.yj.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();
        
        studentMap.put("studentA",90);
        studentMap.put("studentA",100);

        System.out.println("studentMap = " + studentMap);
        
        studentMap.putIfAbsent("studentA",132132);
        studentMap.put("studentA",10000);

        System.out.println("studentMap = " + studentMap);

        
    }
}
