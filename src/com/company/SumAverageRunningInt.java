package com.company;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        //через For цикл
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number;
        }
        average = (double) sum / (upperbound - lowerbound + 1);
        System.out.println("Сумма от " + lowerbound + " до " + upperbound + " равна " + sum + ".\nВ среднем " + average);

        //через Do While цикл
        sum = 0;
        int counterDoWhile = lowerbound;
        do {
            sum += counterDoWhile;
            counterDoWhile++;
        } while (counterDoWhile <= upperbound);
        average = (double) sum / (upperbound - lowerbound + 1);
        System.out.println("Сумма от " + lowerbound + " до " + upperbound + " равна " + sum + ".\nВ среднем " + average);

        //через While Do цикл
        sum = 0;
        int counterWhileDo = lowerbound;
        while (counterWhileDo <= upperbound) {
            sum += counterWhileDo;
            counterWhileDo++;
        }
        average = (double) sum / (upperbound - lowerbound + 1);
        System.out.println("Сумма от " + lowerbound + " до " + upperbound + " равна " + sum + ".\nВ среднем " + average);

        //подсчет числа в пределах диапазона
        int count = 0;
        sum = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += Math.pow(number, 2);
            count++;
        }
        average = (double) sum / (upperbound - lowerbound + 1);
        System.out.println("Сумма квадратов от " + lowerbound + " до " + upperbound + " равна " + sum + ".\nВ среднем от квадратов " + average);
        System.out.println("Счетчик покажет значение чисел в диапазоне");
        System.out.println(count);
        System.out.println("Но для этого не обязательно использовать счетчик и замедлять процесс");
        System.out.println("Циклы это плохо, если есть вариант просто выполнить алгоритмическое действие (upperbound - lowerbound + 1):");
        System.out.println("Выходит то же занчение что и в count: " + (upperbound - lowerbound + 1));


        //сумма нечетных и четных чисел
        int sumOdd = 0; //сумма нечетных чисел
        int sumEven = 0; //сумма четных чисел
        int absDiff; //Абсолютная разница между двумя суммами

        for (int number = lowerbound; number <= upperbound; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Сумма нечетных чисел: " + sumOdd);

        //вычисление абсолютной разницы через if - else выражение
        if (sumEven > sumOdd) {
            absDiff = sumEven - sumOdd;
        } else {
            absDiff = sumOdd - sumEven;
        }
        System.out.println("Абсолютная разница между суммами через if - else выражение: " + absDiff);

        //вычисление абсолютной разницы через линейное условное выражение
        absDiff = (sumEven > sumOdd)?sumEven - sumOdd:sumOdd - sumEven;
        System.out.println("Абсолютная разница между суммами через линейное условное выражение: " + absDiff);

        //либо можно поступить еще проще
        absDiff = Math.abs(sumEven - sumOdd);
        System.out.println("Абсолютная разница между суммами через модуль: " + absDiff);
    }
}
