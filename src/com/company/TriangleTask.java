package com.company;

import java.util.Scanner;

public class TriangleTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        if (x1 >= x2 + x3 || x2 >= x1 + x3 || x3 >= x1 + x2) {
            System.out.println("Такой треугольник не может существовать");
        } else {
            System.out.println("Треугольник с такими сторонами имеет место быть");
        }
    }
}
