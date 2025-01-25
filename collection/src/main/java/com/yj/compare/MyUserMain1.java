package com.yj.compare;

import java.util.Arrays;

public class MyUserMain1 {
    public static void main(String[] args) {
        Myuser myuser1= new Myuser("a",30);
        Myuser myuser2= new Myuser("b",20);
        Myuser myuser3= new Myuser("c",10);
        Myuser[] myusers = {myuser1,myuser2,myuser3};
        System.out.println("Arrays.toString(myusers) = " + Arrays.toString(myusers));

        Arrays.sort(myusers);
        System.out.println("Arrays.toString(myusers) = " + Arrays.toString(myusers));

        Arrays.sort(myusers,new IdComparotor());
        System.out.println("Arrays.toString(myusers) = " + Arrays.toString(myusers));

        Arrays.sort(myusers,new IdComparotor().reversed());
        System.out.println("Arrays.toString(myusers) = " + Arrays.toString(myusers));
    }
}
