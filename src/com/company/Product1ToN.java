package com.company;

public class Product1ToN {
    public static void main(String[] args) {
        int product = 1;
        int lowerbound = 1;
        int upperbound = 10;

        for (int i = lowerbound; i <= upperbound; i++) {
            product *= i;
        }
        System.out.println("Факториал равен: " + product);
    }
}
