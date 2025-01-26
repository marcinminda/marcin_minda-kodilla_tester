package com.kodilla.inheritance.homework;

class System2 extends OperatingSystem {

    public System2(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOff() {
        System.out.println("TURN OFF");
    }

}
