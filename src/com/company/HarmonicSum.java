package com.company;

public class HarmonicSum {
    public static void main(String[] args) {
        int maxDenominator = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += (double) 1 / denominator;
        }
        System.out.println("Сумма слева направо: " + sumL2R);

        for (int denominator = maxDenominator; denominator >= 1; denominator--) {
            sumR2L += (double) 1 / denominator;
        }
        System.out.println("Сумма справа налево: " + sumR2L);

        absDiff = (sumL2R > sumR2L)?sumL2R-sumR2L:sumR2L-sumL2R;

        System.out.println("Абсолютная разница равна: " + absDiff);
    }
}
