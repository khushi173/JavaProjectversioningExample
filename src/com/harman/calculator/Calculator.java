package com.harman.calculator;

public class Calculator {
    public static void main(String[] args) {
        Subtraction ob_sub = new Subtraction();
        int x = 10, y = 30, z, result1;
        z = x + y;
        System.out.println(z);
        result1 = ob_sub.sub(x,y);
        System.out.println(result1);
    }
}
