package com.tsi.java.oop.Error;

public class CustomException  extends Exception{
    String message;

    public CustomException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public CustomException(String message) {
    }
}

