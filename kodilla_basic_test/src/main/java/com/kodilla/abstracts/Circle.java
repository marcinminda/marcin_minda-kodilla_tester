package com.kodilla.abstracts;

public class Circle extends Shape {
    private double r;

    public Circle (double r){
        this.r = r;
    }
    @Override
    public double CalcArea(){
        return Math.PI * r*r;
    }
    @Override
    public double CalcCircuit(){
        return 2*Math.PI * r;
    }

}
