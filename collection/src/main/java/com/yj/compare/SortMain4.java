package com.yj.compare;

import java.util.TreeSet;

public class SortMain4 {
    public static void main(String[] args) {
        Myuser myuser1= new Myuser("a",30);
        Myuser myuser2= new Myuser("b",20);
        Myuser myuser3= new Myuser("c",10);

        TreeSet<Myuser> set =  new TreeSet<>();
        set.add(myuser1);
        set.add(myuser2);
        set.add(myuser3);
        System.out.println("set = " + set);

        TreeSet<Myuser> myusers = new TreeSet<>(new IdComparotor().reversed());
        myusers.add(myuser1);
        myusers.add(myuser2);
        myusers.add(myuser3);

        System.out.println("myusers = " + myusers);

    }
}
