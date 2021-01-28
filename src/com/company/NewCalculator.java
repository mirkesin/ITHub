package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewCalculator {
    public static void main(String[] args) {
        final char beep = '\u0007';
        double result = 0.0;
        boolean flag = true;
        String str_num1 = null;
        String str_num2 = null;

        System.out.println("Let's start calculations!");
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            try {
                System.out.print("Enter the 1st number: ");
                int number1;
                number1 = scanner.nextInt();

                System.out.print("Enter the 2nd number: ");
                int number2;
                number2 = scanner.nextInt();

                System.out.print("Enter the arithmetical sign (+, -, *, /): ");
                char sign = scanner.next().charAt(0);

                switch (sign) {
                    case '+': result = number1 + number2;
                    case '-': result = number1 - number2;
                    case '*': result = number1 * number2;
                    case '/': result = number1 / number2;
                }
                str_num1 = Double.toString(number1);
                str_num2 = Double.toString(number2);
            } catch (NumberFormatException e) {
                System.out.println(beep);
                assert str_num1 != null;
                if (str_num1.equals("")) {
                    System.out.println("ERROR: Invalid first number!");
                } else {
                    System.out.println("ERROR: Invalid second number!");
                }
            } catch (ArithmeticException e) {
                System.out.println(beep);
                System.out.println("ERROR: Division on zero!");
            } catch (Exception e) {
                System.out.println(beep);
                System.out.println("ERROR!");
            }

            System.out.println(result);

            System.out.println("Do you want to continue? (1 for yes, other for no)");
            char choice_new = scanner.next().charAt(0);

            flag = choice_new == '1';
        }
    }
}
