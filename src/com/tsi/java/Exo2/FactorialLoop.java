package com.tsi.java.Exo2;

public class FactorialLoop { public static void main(String[] args) {
    int i, f = 1;
    int num = 5;
    for(i = 1; i <= num; i++) {
        f = f*i;
    }
    System.out.println("Factorial is : "+ f);
}
}
