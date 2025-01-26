package com.kodilla.abstracts;

public class Square extends Shape {
    private double a;

    public Square (double a){
        this.a = a;
    }
@Override
    public double CalcArea(){
        return a*a;
}
    @Override
    public double CalcCircuit(){
        return 4*a;
    }

}
