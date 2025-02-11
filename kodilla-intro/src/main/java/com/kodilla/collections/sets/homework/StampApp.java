package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApp {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Stamp1", 20, 30, 'Y' ));
        stamps.add(new Stamp("Stamp2", 40, 35, 'N' ));
        stamps.add(new Stamp("Stamp3", 10, 20, 'N' ));
        stamps.add(new Stamp("Stamp1", 20, 30, 'Y' ));
        stamps.add(new Stamp("Stamp2", 40, 35, 'N' ));
        stamps.add(new Stamp("Stamp3", 10, 20, 'N' ));

        System.out.println(stamps.size());
        for(Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
