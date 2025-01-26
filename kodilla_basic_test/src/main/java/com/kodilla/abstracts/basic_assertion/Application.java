package com.kodilla.abstracts.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator1 = new Calculator();
        int c = 5;
        int d = 7;
        int sumResult1 = calculator1.subtract(c, d);
        boolean correct1 = ResultChecker.assertEquals(13, sumResult1);
        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + c + " i " + d);
        }

        Calculator calculator2 = new Calculator();
        int e = 3;
        int f = 2;
        int sumResult2 = calculator2.power(e, f);
       // System.out.println(+sumResult2);
        boolean correct2 = ResultChecker.assertEquals(9, sumResult2);
        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczby " + e + " do potegi " + f);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczby " + e + " do potegi " + f);
        }

    }
}