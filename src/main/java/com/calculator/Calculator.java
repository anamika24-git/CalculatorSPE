package com.calculator;
public class Calculator {

    public int calculateAddition(int a, int b) {
        return a + b;
    }
    public int calculateSubtraction(int a, int b) {
        return a - b;
    }
    public int calculateMultiplication(int a, int b) {
        return a * b;
    }
    public double calculateDivision(double a, double b)  {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public double calculateSquareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers");
        }
            return Math.sqrt(a);
    }


    public double calculateLog (double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Log is not defined for non-positive numbers");
        }
        return Math.log(a);
    }
    public long calculateFactorial(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        return result;
    }
    public long calculatePower(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be a non-negative integer.");
        }

        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }



}
