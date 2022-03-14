package com.tsi.java.Animals.Exo6_7;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    protected void bark() {
        System.out.printf("%s Bark\n", name);
    }
}
