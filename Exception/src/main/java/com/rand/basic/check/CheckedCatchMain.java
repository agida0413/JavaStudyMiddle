package com.rand.basic.check;

public class CheckedCatchMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callCatch();
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("def");
        
        String result = stringBuilder.toString();
        System.out.println("result = " + result);
    }
}
