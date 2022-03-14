package com.tsi.java.Exo1;

public class GravityCalculator {
    static final double GRAVITY = -9.81; //Earth's gravity in m/s^2

    int fallingTime = 10; //t
    double initialPosition = 0.0; //x0
    double initialVelocity = 0.0; //v0
    double finalPosition = 0.0; //x(t)

    public double calculate() {
        finalPosition = fallingTime * fallingTime * GRAVITY * 0.5 + initialVelocity * fallingTime + initialPosition;
        System.out.println("Position in"+ fallingTime +"seconds:"+finalPosition);

        return finalPosition;
    }

    public static void main(String... args) {
        new com.tsi.java.GravityCalculator().calculate();
    }
}
