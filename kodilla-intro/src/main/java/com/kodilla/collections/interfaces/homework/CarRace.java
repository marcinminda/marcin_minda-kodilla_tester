package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(10);
        Car opel = new Opel(10);
        Car kia = new Kia(10);

        System.out.println("Ford" );
        doRace(ford);

        System.out.println("\nOpel" );
        doRace(opel);

        System.out.println("Kia" );
        doRace(kia);
    }
        public static void doRace(Car car) {

            for (int i = 0; i < 3; i++) {
                car.increaseSpeed();
            }


            for (int i = 0; i < 2; i++) {
                car.decreaseSpeed();
            }


            System.out.println("Końcowa prędkość: " + car.getSpeed());
        }

}
