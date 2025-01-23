package com.yj.set;

public class StringHashMain {
    static final int CAPACITY = 10;
    public static void main(String[] args) {

        char charA ='A';
        char charB ='B';
        System.out.println("charB = " + (int)charB);
        System.out.println("charA = " + (int)charA);


        System.out.println("hashCode = " + hashCode("A"));
        System.out.println("hashCode1 = " + hashCode("B"));
        System.out.println("hashCode2 = " + hashCode("AB"));

        //해시 인덱스
        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCodeA);
        System.out.println("hashIndex = " + hashIndex);
    }

    static int hashCode(String str){

        char [] charArr = str.toCharArray();
        int sum = 0;

        for (char c : charArr) {
            sum = sum +(int)c;
        }
        return sum;
    }
    
    static int hashIndex(int hashCode){
        return hashCode % CAPACITY;
    }
}
