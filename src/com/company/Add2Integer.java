package com.company;

import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args) {
        int number1, number2, sum;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        number2 = scanner.nextInt();
        sum = number1 + number2;
        System.out.print("Сумма: " + sum);
        scanner.close();
    }
}
