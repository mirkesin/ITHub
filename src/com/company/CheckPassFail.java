package com.company;

public class CheckPassFail {
    public static void main(String[] args) {
        int mark = 100;
        System.out.println("Отметка есть " + mark);

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("Done");
    }
}
