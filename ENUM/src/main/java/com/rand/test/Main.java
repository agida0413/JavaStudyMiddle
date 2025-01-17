package com.rand.test;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("에러코드입력:");
        String err = scanner.next();
        try {
            throw new RuntimeException(err);

        }
        catch (RuntimeException e){
            String msg = e.getMessage();
;
            ErrCode [] values = ErrCode.values();
            for (ErrCode value : values) {
                if(msg.equals(value.getErrCode())){
                    ErrCode errCode = value;

                    System.out.println(errCode.getErrCode());
                    System.out.println(errCode.getMessage());
                }
            }
        }

    }

}
