package com.kodilla.abstracts;

public class Duck extends Animal{
    public Duck(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void giveVoice() {
        System.out.println("qua qua");
    }
}
