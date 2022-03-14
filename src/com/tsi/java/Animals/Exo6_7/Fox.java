package com.tsi.java.Animals.Exo6_7;

public class Fox extends Animal{

    public Fox(String name) {
        super(name);
    }
    @Override
    protected void wa_pow() {
        System.out.printf("%s Wa-pow\n", name);
    }
}
