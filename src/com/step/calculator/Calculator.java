package com.step.calculator;

public class Calculator {
    public void addition (int a, int b){
        System.out.println(a + "+" + b + "=" + (a+b));
    }

    public void multiplication(int a, int b){
        System.out.println(a + "*" + b + "=" + (a*b));
    }

    public void division(int a, int b){
        double v = (double)a/b;
        System.out.println(a + "/" + b + "=" + v);
    }

    public void subtraction(int a, int b){
        System.out.println(a + "-" + b + "=" + (a-b));
    }

    public void percentage(int a, int b){
        System.out.println(a + "% of" + b + "=" + (a * b)/100);
    }
}
