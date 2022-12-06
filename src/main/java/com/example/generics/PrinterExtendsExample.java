package com.example.generics;

public class PrinterExtendsExample <T extends Object>{

    //if its an interfce we still need to use extends like class PrinterExtendsExample <T extends Interface//
    // Cool thing is we can extend multiple like PrinterExtendsExample <T extends Object & Blah>. In this case
//    Object needs to be class and blah is interface
    T inputToPrint;
    public PrinterExtendsExample(T inputToPrint) {
        this.inputToPrint = inputToPrint;
        System.out.println(inputToPrint+" is of instance"+ inputToPrint.getClass().getName());
    }
}
