package com.yj.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();
        
        //학생 성적 데이터 추가
        studentMap.put("studentA",90);
        studentMap.put("studentB",80);
        studentMap.put("studentC",80);
        studentMap.put("studentD",10);
        System.out.println("studentMap = " + studentMap);


        Integer result = studentMap.get("studentB");
        System.out.println("result = " + result);

        System.out.println(" keyset활용");
        //키셋으로 셋자료구조로 반환한다. 키만 
        Set<String> keySet = studentMap.keySet();

        System.out.println("keySet = " + keySet);
        //List아님 Collection임
        Collection<Integer> values = studentMap.values();
        System.out.println("values = " + values);

        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();

        //key, value 둘다 짝으로 묶어 보관하는 객체
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key =" +key);
            System.out.println("value =" +value);
        }



    }
}
