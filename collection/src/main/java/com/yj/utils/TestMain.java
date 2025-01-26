package com.yj.utils;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        Member member = new Member(1,"Kim",20);
        Member member1 = new Member(1123,"Kimt",1);
        Member member2 = new Member(140,"Kim3",50);

        List<Member> list = new ArrayList<>();
        list.add(member);
        list.add(member1);

        list.add(member2);
        Collections.sort(list);
//        for (Member member3 : list) {
//            System.out.println("member3 = " + member3);
//        }
        System.out.println("list = " + list);
    }
}
