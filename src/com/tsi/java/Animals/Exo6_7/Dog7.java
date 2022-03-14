package com.tsi.java.Animals.Exo6_7;

public class Dog7 extends Domestic {

    public Dog7(String name) {
        super(name);
    }

    protected void printNameDog() {
        System.out.printf("%s Scooby-Doo\n", name);
    }
}
