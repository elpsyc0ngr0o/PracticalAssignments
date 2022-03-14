package com.tsi.java.Exo5;
import java.util.Random;

    public class TwoDimensionalArray {
        public static void main(String[] args){
            Random rand = new Random();
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++) {
                for(int h = 0; h < array[i].length; h++) {
                    array[i][h] = new Random().nextInt(0,100);
                System.out.println(array[i][h]);
            }


//I don't understand why it doesn't recognize the [h] symbol... Otherwise, I think the code is good

int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    int sum = 0;
    double avg;
        for (i = 0; i < array.length; i++) {
            for(int h = 0; h < array[i].length; i++) {
                int current = array[i][h];

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
}
}

