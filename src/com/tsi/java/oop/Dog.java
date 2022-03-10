package com.tsi.java.oop;

public class Dog extends Animal{

    public Dog(String scooby_doo) {
        super(scooby_doo);
    }

    @Override
    protected void speak() {
        System.out.println("woof");
    }

    public void guard() {
        System.out.printf("%s Guarding the house", name);
    }
}
