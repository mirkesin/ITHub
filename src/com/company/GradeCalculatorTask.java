package com.company;

import java.util.Scanner;

public class GradeCalculatorTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 1;
        int tempVar;
        int counter = -1;
        do {
            tempVar = scanner.nextInt();
            temp += tempVar;
            counter++;
        } while (tempVar != -1);
        float res = (float) temp / counter;
        System.out.println("Average grade: " + res);
    }
}
