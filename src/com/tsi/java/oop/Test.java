package com.tsi.java.oop;

public class Test {

    public static void main(String...args) {

        Animal a1 = new Animal("SomeDoggo");

        a1.speak();
        a1.walk();
        a1.eat();

        Dog dog = new Dog("Guard dog");

        dog.guard();

    }
}

