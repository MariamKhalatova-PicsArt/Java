package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        System.out.println("Please enter a number");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        oddEven(number1);
        System.out.println("Enter a sign");
        Scanner sc2 = new Scanner(System.in);

        String signa = sc2.nextLine();
        switch (signa){
            case "+":
                System.out.println("plus");
                break;
                case "-":
                    System.out.println("minus");
                    break;
            default : System.out.println("Enter a valid sign");
            }
        }


    public static void oddEven(int input) {
        if (input % 2 == 0) {
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }


    }
}