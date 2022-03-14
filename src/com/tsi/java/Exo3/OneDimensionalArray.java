package com.tsi.java.Exo3;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;


public class OneDimensionalArray {
    public static void main(String[] args){
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0,100);
            System.out.println(array[i]);
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int sum = 0;
        double avg;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if(min > current) {
                min = current;
            }

            if (max > current) {
                max = current;
            }

            sum += current;

            }

        System.out.println("\n========= MIN, MAX and AVG =============");
        System.out.printf("Min value is %d and Max value is %d", min, max);
        System.out.printf("\nAverage is %d", (sum/ array.length));
    }

    }




