package com.kodilla.collections.interfaces.homework;

public class Kia implements Car{
    int speed = 0;

    public Kia(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
    }
}
