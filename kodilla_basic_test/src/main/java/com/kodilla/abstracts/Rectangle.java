package com.kodilla.abstracts;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double CalcArea(){
        return a*b;
    }
    @Override
    public double CalcCircuit(){
        return 2*(a+b);
    }

}