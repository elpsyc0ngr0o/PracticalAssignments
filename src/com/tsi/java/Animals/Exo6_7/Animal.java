package com.tsi.java.Animals.Exo6_7;

public class Animal {

    protected final String name;

    public Animal (String name) {
        this.name = name;
    }

    protected void wa_pow() {
        System.out.printf("%s Wa-pow\n", name);
    }

    protected void meow() {
        System.out.printf("%s Meow\n", name);
    }

    protected void bark() {
        System.out.printf("%s Bark\n", name);
    }
}
