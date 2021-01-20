package com.company;

public class Main {

    public static void main(String[] args) {
        //целые числа

        byte myByte = 127;
        short myShort = 32767;
        int myInt = myByte + myShort;

        long myLong = 12_345_678_912_345_789L; //будет ругаться если не поставить L (можно использовать нижние подчеркивания для удобства восприятия)

        //вещественные типы данных

        float myFloat = 23.688_883_434_343F;
        double myDouble = 45.699_785_657_49_123_245D;

        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);

        float result = (float) (myByte + myShort + myInt + myLong + myFloat + myDouble);

        System.out.println(result);


        //символьные типы данных

        char char1 = 'Р';
        char char2 = 'Е';
        char char3 = 'Б';
        char char4 = 'У';
        char char5 = 'С';
        char char6 = '?';

        System.out.println("char text: " + char1 + char2 + char3 + char4 + char5 + char6);

        //булиновские значения

        boolean bool1 = false;
        boolean bool2 = true;

        System.out.println("bool1 = " + bool1 + "; bool2 = " + bool2);

        if (bool2) {
            System.out.println(bool1);
        }
    }
}
