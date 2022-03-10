package com.tsi.java;

/**
 * x (t) = (t ^ 2) * a * 0.5 * v0 * t + x0
 */

public class CalculatorBIS {
    public static final double GRAVITY_CONSTANT = 9.8; //final=constante=ecrire comme ca
    public static final double ANOTHER_CONSTANT = 9.8;

    // fallingTime, initialPosition, intialVelocity

    int fallingTime = 10; //t
    double initialPosition = 0.0; //x0
    double initialVelocity = 0.0; //v0

    public CalculatorBIS() {
    }

    public CalculatorBIS (int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

    public void calculate() {
        double result = (Math.pow(fallingTime, 2) * (GRAVITY_CONSTANT * ANOTHER_CONSTANT + initialVelocity * fallingTime + initialPosition));
        System.out.println("Position in"+ fallingTime +"seconds:"+ result);
    }

    public static void main(String[] args) {
        CalculatorBIS calculator = new CalculatorBIS ( 50, 100, 200 );

        calculator.calculate();
    }
 }
