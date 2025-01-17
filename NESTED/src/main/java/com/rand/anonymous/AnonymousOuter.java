package com.rand.anonymous;


import com.rand.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar =1;



     Printer printer=  new Printer(){
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("Localvalue = " + localVar);
                System.out.println("paramvalue = " + paramVar);
                System.out.println("outvalue = " + outInstanceVar);
            }
        };

     printer.print();
    }

    public static void main(String[] args) {
        AnonymousOuter localOutverV1 = new AnonymousOuter();
        localOutverV1.process(132);

    }
}
