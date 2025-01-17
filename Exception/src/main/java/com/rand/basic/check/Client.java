package com.rand.basic.check;

public class Client {
    public void call() throws MyCheckedException{

        //문제 상황
        throw new MyCheckedException("ex");
    }
}
