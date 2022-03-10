package com.tsi.java.oop;

public class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void speak() {
        System.out.printf("%s noises\n", name);
    }

    protected void eat (){
        System.out.printf("%s eating Food\n", name);
    }

    protected void walk () {
        System.out.printf("walking on my feet\n", name);
    }
}
