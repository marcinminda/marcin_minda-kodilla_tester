package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;



public class CarsApplication {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        int arraySize = RANDOM.nextInt(15) + 1;
        Car[] cars = new Car[arraySize];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    private static Car drawCar() {
        int drawnShapeKind = RANDOM.nextInt(3);
        int a = getRandomSize();
        if (drawnShapeKind == 0)
            return new Ford(a);
        else if (drawnShapeKind == 1)
            return new Opel(a);
        else {
            return new Kia(a);
        }
    }

        private static int getRandomSize() {
            return RANDOM.nextInt(10) * 100 + 1;
        }
}
