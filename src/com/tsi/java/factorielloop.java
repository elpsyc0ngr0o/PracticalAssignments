package com.tsi.java;

public class factorielloop {

    //: f = N! = 1 * 2 * 3 * ... * N;
    // n * n-1!
    public int factorialRec(int num) {

        if (num == 0) {
            return 1;
        }

        return num * factorialRec (num - 1);
    }

    public long factorialLoop(int num) {

        System.out.println("factorial");

        return 0;
    }


    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        int result = recursion.factorial(10);

        System.out.println("Facrtorial:" + result);

}
}

