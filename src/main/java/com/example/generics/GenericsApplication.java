package com.example.generics;

import org.springframework.boot.SpringApplication;



public class GenericsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenericsApplication.class, args);
    }
    Printer<Integer> printer = new Printer<>(1);
    Printer<Double> printerDouble = new Printer<>(1.1);
}
