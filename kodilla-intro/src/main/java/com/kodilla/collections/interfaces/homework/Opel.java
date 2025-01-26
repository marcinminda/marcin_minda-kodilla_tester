package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    int speed = 0;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 3;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 2;
    }
}
