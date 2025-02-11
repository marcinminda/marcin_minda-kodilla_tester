package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
