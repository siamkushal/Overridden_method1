package com.siam.scjpexamples;

class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eating hay, oats "+"and horse treats");
    }
    public void printTest() {
        super.printTest(); //invoke the superclass (Animal) code
        // then do Horse-specific print work here
        System.out.println("This is printTest from Horse");
    };

}
