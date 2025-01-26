package com.kodilla.inheritance.homework;

class System1 extends OperatingSystem {

    public System1(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("TURN ON");
    }

}

