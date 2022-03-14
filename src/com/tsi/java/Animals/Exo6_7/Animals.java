package com.tsi.java.Animals.Exo6_7;

public class Animals {

    public static void main(String[] args) {
        Animal a1 = new Fox("Fox");
        Animal a2 = new Cat("Cat");
        Animal a3 = new Dog("Dog");

        a1.wa_pow();
        a2.meow();
        a3.bark();
    }
}
