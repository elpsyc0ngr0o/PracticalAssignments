package com.tsi.java;

public class Loops {

public void demoForLoop(){

    for(int i = 0; i < 10; i++)  {
        System.out.println("This is for loop: i = " + i);

    }
}

public static void main(String... args) {
    Loops loops = new Loops();

    loops.demoForLoop();
}
}
