package com.example.generics;

public class Printer <T>{
    T inputToPrint;
    public Printer(T inputToPrint) {
    this.inputToPrint = inputToPrint;
    System.out.println(inputToPrint+" is of instance"+ inputToPrint.getClass().getName());
    }
}
