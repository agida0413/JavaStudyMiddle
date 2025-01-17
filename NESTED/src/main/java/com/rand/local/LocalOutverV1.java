package com.rand.local;

public class LocalOutverV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar =1;

        class LocalPrinter{
            int value = 0;

            public void printData(){
                System.out.println("value = " + value);
                System.out.println("Localvalue = " + localVar);
                System.out.println("paramvalue = " + paramVar);
                System.out.println("outvalue = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOutverV1 localOutverV1 = new LocalOutverV1();
        localOutverV1.process(132);

    }
}
