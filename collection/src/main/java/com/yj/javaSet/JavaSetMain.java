package com.yj.javaSet;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        Set

        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());


    }

    private static void run(Set<String> set){
        System.out.println("set.getClass() = " + set.getClass());
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("1");
        set.add("2");

        //


        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ");

        }
        System.out.println();

    }


}
