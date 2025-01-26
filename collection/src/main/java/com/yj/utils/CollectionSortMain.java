package com.yj.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //가장 큰값
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    
        //랜덤하게 리스트를 섞음
        Collections.shuffle(list);
        System.out.println("list = " + list);

        Collections.sort(list);

        Collections.reverse(list);


    }
}
