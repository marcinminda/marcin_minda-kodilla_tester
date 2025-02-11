package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Kia(25));
        cars.add(new Kia(30));
        cars.add(new Opel(70));
        cars.add(new Opel(65));
        cars.add(new Ford(100));
        cars.add(new Ford(110));

        cars.remove(3);

        Kia kia = new Kia(25);
        cars.remove(kia);

        System.out.println(cars.size());
        for(Car car : cars){
            describeCar(car);
            System.out.println();
        }

    }
}
