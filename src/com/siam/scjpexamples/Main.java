package com.siam.scjpexamples;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();

        b.printTest(); // runs the Animal version of eat()
        a.printTest(); // runs the Horse version of eat()
    }
}
