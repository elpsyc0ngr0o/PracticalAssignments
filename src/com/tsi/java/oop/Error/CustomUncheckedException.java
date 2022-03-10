package com.tsi.java.oop.Error;

public class CustomUncheckedException extends RuntimeException {
    String message;

    public CustomUncheckedException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public CustomUncheckedException() {

    }
}
