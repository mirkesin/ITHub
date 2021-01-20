package com.company;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double diameter, radius, circumference, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        radius = scanner.nextDouble();

        diameter = 2.0 * radius;
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2.0 * Math.PI * radius;

        System.out.printf("Диаметер равен:% .2f% n", diameter);
        System.out.printf("Площадь равна:% .2f% n", area);
        System.out.printf("Длина равна:% .2f%", circumference);
    }
}
