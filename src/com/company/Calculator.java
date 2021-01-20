package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("//////////----------##########_##########----------\\\\\\\\\\\\\\\\\\\\");
        System.out.println();
        System.out.println("Created by Anton Podlesnyy aka Anton aka Antoha aka Toha aka Tohtar");
        System.out.println();
        System.out.println("//////////----------##########_##########----------\\\\\\\\\\\\\\\\\\\\");
        double result = 0.0;
        int value = 0;
        boolean isResult = true;
        boolean isReal = false;
        char continuous = '1';

        System.out.println("Do you want to start the calculations? 1(for 'Yes') and other thing doesn't matter (for 'No')");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();


        while (continuous == '1')
        if (choice.equals("1")) {
            System.out.print("Enter the 1st number: ");
            double number1;
            number1 = scanner.nextDouble();
            System.out.print("Enter the 2nd number: ");
            double number2;
            number2 = scanner.nextDouble();
            System.out.print("Enter the arithmetical sign (+, -, *, /): ");
            char sign = scanner.next().charAt(0);
            if (sign == '+') {
                result = number1 + number2;
            } else if (sign == '-') {
                result = number1 - number2;
            } else if (sign == '*') {
                result = number1 * number2;
            } else if (sign == '/') {
                result = number1 / number2;
            } else {
                isResult = false;
            }
            if (result % 1 == 0) {
                value = (int) result;
                isReal = true;
            }
            if (isResult) {
                if (isReal) {
                    System.out.println("Result is: " + value);
                } else {
                    System.out.println("Result is: " + result);
                }
                System.out.println("Do you want to continue? 1(for 'Yes') and other thing doesn't matter (for 'No')");
                continuous = scanner.next().charAt(0);
                if (continuous == '1') {
                    System.out.println("Here we go ;)");
                } else {
                    System.out.println("Ok, bye, my friend!");
                    continuous = 'N';
                }
            } else {
                System.out.println("Such sign does not exist!!!");
            }
        } else {
            System.out.println("Ok, bye, my friend!");
        }
    }
}
