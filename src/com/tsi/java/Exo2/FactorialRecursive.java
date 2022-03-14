package com.tsi.java.Exo2;

import com.tsi.java.Recursion;

public class FactorialRecursive {


    //: f = N! = 1 * 2 * 3 * ... * N;
    // n * n-1!
    public int factorialRec(int num) {

        if (num == 0) {
            return 1;
        }

        return num * factorialRec (num - 1);
    }

    public static void main(String... args) {
        Recursion recursion = new Recursion();

        int result = recursion.factorial(5);

        System.out.println("Factorial:" + result);

    }
}
