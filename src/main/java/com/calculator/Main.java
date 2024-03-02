package com.calculator;

import java.io.BufferedReader;
import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        // if (args.length == 0) {
        //     System.out.println("No command-line argument provided. Using default value or handling it in a way suitable for your application.");
        //     
        // }

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Calculator cal = new Calculator();
        int N, N1;
        while(true) {
            System.out.println("Welcome to Calculator System");
        System.out.println("Enter Operation choice: ");
        System.out.println(
                "press 1 for Addition\n" + "press 2 for Subtraction\n" +
                        "press 3 for Multiplication\n" + "press 4 for Division\n" +
                        "press 5 for Square Root\n" + "press 6 for Log\n" +
                        "press 7 for Factorial\n" + "press 8 for Power\n" + "press 9 to quit");
        int choice = Integer.parseInt(input.readLine());
        if(choice == 9) {
            System.out.println("Exiting from System");
            break;
        }
        switch (choice) {
            case 1:
                System.out.println("Enter the first Operand");
                N = Integer.parseInt(input.readLine());
                System.out.println("Enter the Second Operand");
                N1 = Integer.parseInt(input.readLine());
                System.out.println("Result: " + cal.calculateAddition(N, N1));
                break;

            case 2:
                System.out.println("Enter the first Operand");
                N = Integer.parseInt(input.readLine());
                System.out.println("Enter the Second Operand");
                N1 = Integer.parseInt(input.readLine());
                System.out.println("Result: " + cal.calculateSubtraction(N, N1));
                break;
            case 3:
                System.out.println("Enter the first Operand");
                N = Integer.parseInt(input.readLine());
                System.out.println("Enter the Second Operand");
                N1 = Integer.parseInt(input.readLine());
                System.out.println("Result: " + cal.calculateMultiplication(N, N1));
                break;
            case 4:
                System.out.println("Enter the first Operand");
                N = Integer.parseInt(input.readLine());
                System.out.println("Enter the Second Operand");
                N1 = Integer.parseInt(input.readLine());
                System.out.println("Result: " + cal.calculateDivision((double) N, (double) N1));
                break;
            case 5:
                System.out.println("Enter the Operand");
                N = Integer.parseInt(input.readLine());
                System.out.println("Result: " + cal.calculateSquareRoot((double) N));
                break;
            case 6:
                System.out.println("Enter the Operand");
                N = Integer.parseInt(input.readLine());
                System.out.println("Result: " + cal.calculateLog((double) N));
                break;
            case 7:
                System.out.println("Enter the Operand");
                N = Integer.parseInt(input.readLine());
                System.out.println("Result: " + cal.calculateFactorial(N));
                break;
            case 8:
                System.out.println("Enter the base");
                N = Integer.parseInt(input.readLine());
                System.out.println("Enter the exponent");
                N1 = Integer.parseInt(input.readLine());
                System.out.println("Result: " + cal.calculatePower(N, N1));
                break;
            default:
                System.out.println("Sorry..Invalid Entry");
                break;
        }

        }
    }
}
