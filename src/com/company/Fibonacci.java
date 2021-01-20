package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int sum = n1 + n2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибонначи, которые Вы желаете увидеть на экране");
        int maxFib = scanner.nextInt();

        System.out.println("Первые " + maxFib + " чисел Фибоначчи:");
        System.out.print(n1 + " " + n2);
        for (int i = 0; i < maxFib - 2; i++) {
            int temp;
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            sum += n2;
            System.out.print(" " + temp);
        }
        double average = (double) sum / maxFib;
        System.out.println("\nВ среднем " + average);
    }
}
