package com.company;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1, number2, number3;
        int sum = 0, product, min, max;
        Scanner scanner = new Scanner (System.in);

        System.out.print("Введите 1-е целое число: ");
        number1 = scanner.nextInt();
        System.out.print("Введите 2-е целое число: ");
        number2 = scanner.nextInt();
        System.out.print("Введите 3-е целое число: ");
        number3 = scanner.nextInt();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        min = number1;
        if (min > number2) {
            min = number2;
        }
        if (min > number3) {
            min = number3;
        }

        max = number1;
        if (max < number2) {
            max = number2;
        }
        if (max < number3) {
            max = number3;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}
