package com.tsi.java.Animals.Exo6_7;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    protected void meow() {
        System.out.printf("%s Meow\n", name);
    }
}

//As I can't extend two time the same class I will create a Cat7 class for exercise 7