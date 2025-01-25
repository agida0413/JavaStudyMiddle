package com.yj.javaSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));
        Set<Integer> unionSet = new HashSet<>();

        //union
        Iterator<Integer> iterator = set1.iterator();
        Iterator<Integer> iterator2 = set2.iterator();

        while (iterator.hasNext()){
            unionSet.add(iterator.next());
        }
        while (iterator2.hasNext()){
            unionSet.add(iterator2.next());
        }

        System.out.println("union" + unionSet);

        //intersect
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection = " + intersection);


        //minus
        Set<Integer> diff= new HashSet<>(set1);
        diff.removeAll(intersection);
        System.out.println("diff = " + diff);

    }
}
