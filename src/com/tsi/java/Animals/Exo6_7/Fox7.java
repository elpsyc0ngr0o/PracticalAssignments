package com.tsi.java.Animals.Exo6_7;

public class Fox7 extends Wild {

    public Fox7(String name) {
        super(name);
    }

    @Override
    protected void printNameFox() {
        System.out.printf("%s Kurama\n", name);
    }
}
