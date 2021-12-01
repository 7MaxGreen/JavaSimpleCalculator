package com.step.Main;
import com.step.calculator.Calculator;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = new Calculator();

        calculator.addition(32,44);
        calculator.multiplication(32, 3);
        calculator.division(333, 32);
        calculator.subtraction(32, 1);
        calculator.percentage(18, 340);
    }
}
