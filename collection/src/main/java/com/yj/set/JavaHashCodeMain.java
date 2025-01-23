package com.yj.set;

import com.yj.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object 기본 hashCode는 객체의 참조값 기반
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println("obj1.hashCode() = " + obj1.hashCode());

        //각 클래스마다 hashCOde를 이미 오버라이딩 해두었다 .

        Integer i =10;
        System.out.println("i.hashCode() = " + i.hashCode());
        String strA ="A";
        System.out.println("strA = " + strA.hashCode());
        String strAB ="AB";

        System.out.println("strAB = " + strAB.hashCode());
        
        //hashcode는 마이너스 값이 들어올 수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());


        //둘은 같을까 ?
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals , hashCode

        System.out.println("member1 == member2="+(member1 == member2));
        System.out.println("member1.eq member2="+(member1.equals(member2)));

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

    }
}
