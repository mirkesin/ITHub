package com.company;

import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3 = 1;
        int sum = n1 + n2 + n3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел Трибонначи, которые Вы желаете увидеть на экране");
        int maxFib = scanner.nextInt();

        System.out.println("Первые " + maxFib + " чисел Трибоначчи:");
        System.out.print(n1 + " " + n2 + " " + n3);
        for (int i = 0; i < maxFib - 3; i++) {
            int temp;
            temp = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = temp;
            sum += n3;
            System.out.print(" " + temp);
        }
        double average = (double) sum / maxFib;
        System.out.println("\nВ среднем " + average);
    }
}
