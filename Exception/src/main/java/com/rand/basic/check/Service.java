package com.rand.basic.check;

public class Service {
    Client client = new Client();
    
    public void callCatch(){
        try {
            client.call();
        } catch (MyCheckedException e) {
            //예외처리
            System.out.println("예외처리,message="+e.getMessage());
        
        }
        System.out.println("정상흐름");
    }

    public void callThrow() throws MyCheckedException{

        client.call();
    }
}
