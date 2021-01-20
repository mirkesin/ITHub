package com.company;

import java.util.Scanner;

public class LoopTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of iterations");
        int iterations = scanner.nextInt();
        while (iterations != 0) {
            System.out.println("\nEnter the group of 3 numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int res = a;
            System.out.println("Output:");
            for (int i = 0; i < n; i++) {
                res += Math.pow(2, i) * b;
                System.out.print(res + " ");
            }
            iterations--;
        }
    }
}
