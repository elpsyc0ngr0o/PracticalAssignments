package com.tsi.java;

import java.sql.SQLOutput;

public class Recursion {

    //: f = N! = 1 * 2 * 3 * ... * N;
    // n * n-1!
    public int factorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * factorial (num - 1);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        int result = recursion.factorial(10);

        System.out.println("Facrtorial:" + result);
    }
}
