package com.yj.set;

import com.yj.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 myHashSetV2 = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("spring.hashCode() = " + spring.hashCode());
        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());

        myHashSetV2.add(hi);
        myHashSetV2.add(jpa);
        myHashSetV2.add(java);
        myHashSetV2.add(spring);
        System.out.println("myset = " + myHashSetV2);

        Member search = new Member("JPAadsad ");
        boolean result = myHashSetV2.contains(search);
        System.out.println("result = " + result);
    }

}
