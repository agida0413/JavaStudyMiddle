package com.yj.utils;

import java.util.*;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬랛ㄴ 새성

        List<Integer> list = List.of(1,2,3);
        Set<Integer> set = Set.of(1,2,3);
        Map<Integer,String> map  = Map.of(1,"one",2,"two");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        Collection<Integer> integers = Collections.unmodifiableCollection(list2);
        for (Integer integer : integers) {
            System.out.println("integer = " + integer);
        }

    }
}
