package com.yj.utils;

import java.util.*;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list.getClass() = " + list.getClass());
        List<Integer> synclist = Collections.synchronizedList(list);

        System.out.println("synclist.getClass() = " + synclist.getClass());


        Set<Integer> set = new TreeSet<>(new TestCompare());
        set.add(10);
        set.add(4);
        set.add(3);
        set.add(15);
        System.out.println("set = " + set);

    }

    static class TestCompare implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1 < o2)?-1:((o1==o2)?0:1)*-1;
        }
    }

}
