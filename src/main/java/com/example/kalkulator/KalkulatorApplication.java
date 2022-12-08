package com.example.kalkulator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Calculator {

    int plus(int a, int b){
        return a+b;
    }

    int minus(int a, int b){
        return a-b;
    }
    public static void main(String[] args) throws java.lang.Exception {
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(5,6));
        System.out.println(calculator.minus(9,3));
    }
}




