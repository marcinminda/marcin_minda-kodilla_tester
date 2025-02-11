package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double width;
    private double height;
    private char isStamped;

    public Stamp(String name, double width, double height, char isStamped) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.isStamped = isStamped;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public char getIsStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(width, stamp.width) == 0 && Double.compare(height, stamp.height) == 0 && isStamped == stamp.isStamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", isStamped=" + isStamped +
                '}';
    }
}
