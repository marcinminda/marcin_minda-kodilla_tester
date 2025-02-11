package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Kia{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return speed == kia.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
