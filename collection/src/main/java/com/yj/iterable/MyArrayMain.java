package com.yj.iterable;

import java.util.*;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1,2,3,4});
        Iterator<Integer> iterator = myArray.iterator();

        while (iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }

        Map<String,Object> map =new HashMap<>();

        map.put("ss","s");
        map.put("ss12","s");
        map.put("ss333","s");
        Set<String> strings = map.keySet();

        Iterator<String> iterator1 = strings.iterator();

        while (iterator1.hasNext()){
            System.out.println("iterator1.next() = " + iterator1.next());
        }

        System.out.println("for-each사용");

        for (int value : myArray) {
            System.out.println(value);
        }
        Set<Map.Entry<String, Object>> entries = map.entrySet();

        Iterator<Map.Entry<String, Object>> iterator2 = entries.iterator();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        //향상된 for문은 사실 iterator가 동작하는 것이다 .

        Collection<Object> values = map.values();

        for (Object value : values) {
            System.out.println("value = " + value);
        }


    }

}
