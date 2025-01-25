package com.yj.compare;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain3 {
    public static void main(String[] args) {
        Myuser myuser1= new Myuser("a",30);
        Myuser myuser2= new Myuser("b",20);
        Myuser myuser3= new Myuser("c",10);

        List<Myuser> list = new LinkedList<>();
        
        list.add(myuser1);
        list.add(myuser2);
        list.add(myuser3);
        
        list.sort(null);

        System.out.println("list = " + list);

        list.sort(new IdComparotor());
        System.out.println("list = " + list);

        //Collections.sort(list);

        System.out.println("list = " + list);
    }
}
