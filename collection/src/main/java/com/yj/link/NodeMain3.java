package com.yj.link;

public class  NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println( first);


        //모든 노드 탐색
        printAll(first);

        //마지막노드


    }

    private static void printAll(Node first) {

    }
}
