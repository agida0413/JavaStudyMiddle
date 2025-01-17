package com.rand.local;

import java.lang.reflect.Field;

public class LocalOutverV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar =1; //지역변수는 스택영역이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {

                System.out.println("value = " + value);
                System.out.println("Localvalue = " + localVar);
                System.out.println("paramvalue = " + paramVar);
                System.out.println("outvalue = " + outInstanceVar);
            }


        }

        LocalPrinter localPrinter = new LocalPrinter();
//        localPrinter.print();
        //만약 localVar 의 값 을 변경하면?
     //   localVar =10;
      //paramVar=20;
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOutverV4 localOutverV1 = new LocalOutverV4();
        Printer printer = localOutverV1.process(132);

        printer.print(); // process의 스택프레임이 사라진 이후에 실행


        System.out.println("필드 확인");
       Field[] fields= printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        
    }
}
