package com.yj.tree;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        
        Message msg1 = new Message("hi",3);
        Message msg2 = new Message("vbc",1);
        Message msg3 = new Message("abx",10);
        
        TreeSet<Message> tree= new TreeSet<>();
        tree.add(msg1);
        tree.add(msg2);
        tree.add(msg3);
        System.out.println("tree = " + tree);
        
        
    }
}
