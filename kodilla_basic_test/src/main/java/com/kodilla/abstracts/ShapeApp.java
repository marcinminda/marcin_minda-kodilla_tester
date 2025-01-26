package com.kodilla.abstracts;

//Prezentacja w ShapeApp

import org.w3c.dom.css.Rect;

public class ShapeApp {
    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println("Square a = 5");
        System.out.println("Square Area: " + square.CalcArea());
        System.out.println("Square Circuit: " + square.CalcCircuit() + "\n");

        Shape circle = new Circle(2);
        System.out.println("Circle r = 2");
        System.out.println("Circle Area: " + circle.CalcArea());
        System.out.println("Circle Circuit: " + circle.CalcCircuit() + "\n");

        Shape rectangle = new Rectangle(2, 5);
        System.out.println("Rectangle a = 5 b = 2");
        System.out.println("Rectangle Area: " + rectangle.CalcArea());
        System.out.println("Rectangle Circuit: " + rectangle.CalcCircuit() + "\n");

    }

}
