package com.example.generics;

import java.util.List;

public class PrinterGenricMethodExample{




    public <T> void  PrinterGenricMethodExample(T inputToPrint) {
    System.out.println(inputToPrint+" is of instance"+ inputToPrint.getClass().getName());
    }

    public <T,V> T  PrinterGenricMethodExample(T inputToPrint, V anotherInput ) {
        System.out.println(inputToPrint+" is of instance"+ inputToPrint.getClass().getName());
        System.out.println(anotherInput+" is of instance"+ anotherInput.getClass().getName());
        return inputToPrint;
    }

    public void  PrinterGenricMethodExample(List<?> generics) {

        System.out.println(generics);
    }

}
