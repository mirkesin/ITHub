package com.company;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 110;

        for (int number = lowerbound; number <= upperbound; number++) { //можно и не работать с булиновскими типами, достаточно прописать логику верную
            if (number % 105 == 0) { // постепенное понижение делителя на даст вернуться к первоначальным условиям проверки и конфликта не возникнет
                System.out.print("CozaLozaWoza");
            } else if (number % 35 == 0) {
                System.out.print("LozaWoza");
            } else if (number % 21 == 0) {
                System.out.print("CozaWoza");
            } else if (number % 15 == 0) {
                System.out.print("CozaLoza");
            } else if (number % 7 == 0) {
                System.out.print("Woza");
            } else if (number % 5 == 0) {
                System.out.print("Loza");
            } else if (number % 3 == 0) {
                System.out.print("Coza");
            } else {
                System.out.print(number);
            }
            //можно было конечно использовать булиновские типы, но это в том случае если прописать все условия в обратном порядке, нежели в моем коде
            //а так разницы особой нет
            if (number % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
