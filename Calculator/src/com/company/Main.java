package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Please enter the first number");
        Scanner sc1 = new Scanner(System.in);
        double numberOne = sc1.nextDouble();
        System.out.println("Please choose an operation: + - * /");
        String action = sc1.next();

        System.out.println("Please enter the second number");
        Scanner sc2 = new Scanner(System.in);
        double numberTwo = sc2.nextDouble();


        switch (action) {
            case "+":
                sum(numberOne, numberTwo);
                break;
            case "-":
                subtraction(numberOne, numberTwo);
                break;
            case "*":
                multiplication(numberOne, numberTwo);
                break;
            case "/":
                division(numberOne, numberTwo);
                break;
            default:
                System.out.println("Enter a valid operation");

        }
    }
public static double sum(double a , double b){
      double result =  a + b;
      System.out.println(result);
      return result;
    }
    public static double subtraction(double a , double b) {
        double result = a - b;
        System.out.println(result);
        return result;
    }
        public static double multiplication(double a , double b) {
            double result = a * b;
            System.out.println(result);
           return result;
        }

    public static double division(double a , double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println(result);
            return result;
        } else {
            System.out.println("Cannot divide by 0.0");
            return 0.0;
        }
    }}




