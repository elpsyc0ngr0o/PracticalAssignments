package com.tsi.java.oop.Error;

public class HandlingErrors {

    // Exceptions
    // Checked and unchecked
    // RuntimeExceptions and others

    int divide (int a, int b) throws CustomException {
        if (b ==0 ) {
            throw new CustomException("Divide by ZERO!!");
        }

        return a/b;
    }

    int getItemFromArray(int[] array, int index) {

        if (index >= array.length) {
            throw new CustomUncheckedException();
        }
        System.out.println("Error : the divisor is ZERO");

        return array[index];
    }
}