package com.tsi.java.Exo2;

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
        FactorialRecursive recursion = new FactorialRecursive();

        long result = recursion.factorialRec(5);

        System.out.println("Factorial:" + result);

    }
}
