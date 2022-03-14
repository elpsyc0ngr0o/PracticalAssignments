package com.tsi.java.Animals.Exo6_7;

public class Cat7 extends Domestic {

    public Cat7(String name) {
        super(name);
    }
    @Override
    protected void cat() {
        System.out.printf("%s Kitty\n", name);
    }
}
