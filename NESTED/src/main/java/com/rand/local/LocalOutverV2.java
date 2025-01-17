package com.rand.local;

public class LocalOutverV2 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar =1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                printData();
            }

            public void printData(){
                System.out.println("value = " + value);
                System.out.println("Localvalue = " + localVar);
                System.out.println("paramvalue = " + paramVar);
                System.out.println("outvalue = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOutverV2 localOutverV1 = new LocalOutverV2();
        localOutverV1.process(132);

    }
}
